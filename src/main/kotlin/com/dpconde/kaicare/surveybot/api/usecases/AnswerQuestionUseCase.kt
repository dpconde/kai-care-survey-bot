package com.dpconde.kaicare.surveybot.api.usecases

interface AnswerQuestionUseCase {

    /**
     * Give answer to a question survey
     * @param questionId
     * @param answerId
     */
    fun execute(questionId: String, answerId: String)

}