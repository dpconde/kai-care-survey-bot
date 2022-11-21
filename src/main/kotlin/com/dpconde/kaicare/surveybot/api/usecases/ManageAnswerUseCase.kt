package com.dpconde.kaicare.surveybot.api.usecases

import java.util.*

interface ManageAnswerUseCase {

    /**
     * Give answer to a question survey
     * @param questionId
     * @param answerId
     */
    fun execute(questionId: UUID, answerId: UUID)

}