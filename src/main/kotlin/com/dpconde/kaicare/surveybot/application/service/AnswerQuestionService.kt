package com.dpconde.kaicare.surveybot.application.service

import java.util.*

interface AnswerQuestionService {

    fun answer(questionId: UUID, answerId: UUID)
}