package com.dpconde.kaicare.surveybot.application.usecase

import com.dpconde.kaicare.surveybot.api.usecases.AnswerQuestionUseCase
import com.dpconde.kaicare.surveybot.application.service.AnswerQuestionService
import org.springframework.stereotype.Service

@Service
class AnswerQuestionUseCaseImpl(
    private val answerQuestionService: AnswerQuestionService
): AnswerQuestionUseCase {

    override fun execute(questionId: String, answerId: String) {
        answerQuestionService.answer(questionId, answerId)
    }
}