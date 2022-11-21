package com.dpconde.kaicare.surveybot.application.service.impl

import com.dpconde.kaicare.surveybot.application.repository.SurveyQuestionRepository
import com.dpconde.kaicare.surveybot.application.service.AnswerQuestionService
import org.springframework.stereotype.Service
import java.util.*

@Service
class AnswerQuestionServiceImpl(
    private val repository: SurveyQuestionRepository
): AnswerQuestionService {

    override fun answer(questionId: UUID, answerId: UUID) {
        repository.answerQuestion(questionId.toString(), answerId.toString())
    }
}