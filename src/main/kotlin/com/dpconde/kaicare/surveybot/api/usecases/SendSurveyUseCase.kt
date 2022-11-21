package com.dpconde.kaicare.surveybot.api.usecases

import java.util.*

interface SendSurveyUseCase {

    /**
     * Send survey to user. It will start sending the first survey question
     * @param templateId
     * @param thread
     * @param userFromId
     * @param userToId
     */
    fun execute(templateId: UUID, thread: String, userFromId: String, userToId: String)

}