package com.dpconde.kaicare.surveybot.application.chat

import com.dpconde.kaicare.surveybot.domain.SurveyQuestion

interface ChatManager {

    /**
     * Send a question message using chat service
     * @param question
     * @param thread
     * @param fromUser
     * @param toUser
     */
    fun sendMessageQuestion(question: SurveyQuestion, thread: String, fromUser: String, toUser: String)

}