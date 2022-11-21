package com.dpconde.kaicare.surveybot.domain

import java.util.*

data class SurveyQuestionAnswer(
    val id: UUID,
    val surveyId: UUID,
    val questionId: UUID,
    val option: String,
    val text: String
)
