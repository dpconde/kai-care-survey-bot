package com.dpconde.kaicare.surveybot.domain

import java.util.*

data class SurveyQuestion(
    val id: UUID,
    val surveyId: UUID,
    val text: String,
    val answers: List<SurveyQuestionAnswer>,
    val selection: SurveyQuestionAnswer?
)
