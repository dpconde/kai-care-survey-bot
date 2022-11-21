package com.dpconde.kaicare.surveybot.application.service.impl

import com.dpconde.kaicare.surveybot.application.InvalidTemplateException
import com.dpconde.kaicare.surveybot.application.repository.SurveyRepository
import com.dpconde.kaicare.surveybot.application.service.CreateSurveyFromTemplateService
import com.dpconde.kaicare.surveybot.domain.Survey
import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreateSurveyFromTemplateServiceImpl(
    private val repository: SurveyRepository
): CreateSurveyFromTemplateService {

    override fun create(templateId: UUID, thread: String, userFromId: String, userToId: String) =
        repository.findById(templateId)
            .also { validateTemplate(it) }
            .let { copySurvey(it, thread, userFromId, userToId) }
            .let { repository.save(it)  }

    private fun copySurvey(template: Survey, thread: String, userFromId: String, userToId: String): Survey {
        val surveyUUID = UUID.randomUUID()
        return template.copy(
            id = surveyUUID,
            isTemplate = false,
            threadId = thread,
            fromUserId = userFromId,
            toUserId = userToId,
            questions = copyQuestions(template, surveyUUID)
        )
    }

    private fun copyQuestions(template: Survey, newSurveyUUID: UUID): List<SurveyQuestion> {
        return template.questions.map { question -> run {
            val questionUUID = UUID.randomUUID()
            question.copy(
                id = questionUUID,
                surveyId = newSurveyUUID,
                answers = copyAnswers(question, questionUUID, newSurveyUUID)) }
        }
    }

    private fun copyAnswers(template: SurveyQuestion, newQuestionUUID: UUID, newSurveyUUID: UUID) =
        template.answers.map { answer -> answer.copy(
            id = UUID.randomUUID(),
            questionId = newQuestionUUID,
            surveyId = newSurveyUUID)
        }

    private fun validateTemplate(template: Survey) =
        template.also {
            if(template.isTemplate.not()) throw InvalidTemplateException("Survey found is not actually a template")
        }
}