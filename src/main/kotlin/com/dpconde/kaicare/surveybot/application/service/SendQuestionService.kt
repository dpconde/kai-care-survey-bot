package com.dpconde.kaicare.surveybot.application.service

import com.dpconde.kaicare.surveybot.domain.SurveyQuestion

interface SendQuestionService {

    fun send(question: SurveyQuestion, thread: String, userFromId: String, userToId: String)
}