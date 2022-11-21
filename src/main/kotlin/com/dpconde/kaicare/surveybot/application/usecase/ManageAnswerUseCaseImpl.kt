package com.dpconde.kaicare.surveybot.application.usecase

import com.dpconde.kaicare.surveybot.api.usecases.ManageAnswerUseCase
import com.dpconde.kaicare.surveybot.application.service.AnswerQuestionService
import com.dpconde.kaicare.surveybot.application.service.FindSurveyByQuestionService
import com.dpconde.kaicare.surveybot.application.service.SendQuestionService
import com.dpconde.kaicare.surveybot.domain.Survey
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@Service
class ManageAnswerUseCaseImpl(
    private val answerQuestionService: AnswerQuestionService,
    private val findSurveyByQuestionService: FindSurveyByQuestionService,
    private val sendQuestionService: SendQuestionService
): ManageAnswerUseCase {

    @Transactional
    override fun execute(questionId: UUID, answerId: UUID) {
        answerQuestionService.answer(questionId, answerId)

        val survey = findSurveyByQuestionService.find(questionId)
        when(survey.questions.any { it.selection == null }){
            true -> sendNextQuestion(survey)
            else -> {}//TODO no more questions to answer
        }
    }

    private fun sendNextQuestion(survey: Survey){
        survey.questions.first { it.selection == null }
            .let { sendQuestionService.send(it, survey.threadId!!, survey.fromUserId!!, survey.toUserId!!) }
    }
}