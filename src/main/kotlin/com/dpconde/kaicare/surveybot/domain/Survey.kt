package com.dpconde.kaicare.surveybot.domain

import java.util.*

data class Survey(
    val id: UUID,
    val name: String,
    val isTemplate: Boolean,
    val fromUserId: String?,
    val toUserId: String?,
    val questions: List<SurveyQuestion>
)
