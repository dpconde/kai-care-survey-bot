package com.dpconde.kaicare.surveybot.application.service.impl

import com.dpconde.kaicare.surveybot.application.chat.ChatManager
import com.dpconde.kaicare.surveybot.application.service.SendQuestionService
import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import org.springframework.stereotype.Service

@Service
class SendQuestionServiceImpl(
    private val chatManager: ChatManager
): SendQuestionService {

    override fun send(question: SurveyQuestion, thread: String, userFromId: String, userToId: String) {
        chatManager.sendMessageQuestion(question, thread, userFromId, userToId)
    }
}