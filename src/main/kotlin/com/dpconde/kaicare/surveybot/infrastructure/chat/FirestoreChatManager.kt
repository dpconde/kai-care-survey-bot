package com.dpconde.kaicare.surveybot.infrastructure.chat

import com.dpconde.kaicare.surveybot.application.chat.ChatManager
import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import com.google.auth.oauth2.GoogleCredentials
import com.google.cloud.firestore.Firestore
import com.google.cloud.firestore.FirestoreOptions
import org.springframework.stereotype.Service
import java.util.*

@Service
class FirestoreChatManager: ChatManager {

    //https://cloud.google.com/firestore/docs/create-database-server-client-library#java_1
    companion object {
        const val PROJECT_ID = "kaicare-8063a" //TODO hide somewhere
        const val MESSAGE_THREAD_KEY = "MESSAGE_THREADS"
        const val MESSAGE_THREAD_MESSAGES_KEY = "MESSAGES"
    }
    private lateinit var db: Firestore

    init {
        val firestoreOptions =
        FirestoreOptions.getDefaultInstance().toBuilder()
            .setProjectId(PROJECT_ID)
            .setCredentials(GoogleCredentials.getApplicationDefault())
            .build()
        db = firestoreOptions.service
    }

    override fun sendMessageQuestion(question: SurveyQuestion, thread: String, fromUser: String, toUser: String) {
        val collection = "$MESSAGE_THREAD_KEY/$thread/$MESSAGE_THREAD_MESSAGES_KEY"
        db.collection(collection).document(UUID.randomUUID().toString())
            .set(mapOf("fromUserId" to fromUser, "sent" to Date(), "textMessage" to question.text ))
    }


}