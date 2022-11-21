package com.dpconde.kaicare.surveybot.application.service

import com.dpconde.kaicare.surveybot.domain.Survey
import java.util.*

interface CreateSurveyFromTemplateService {

    fun create(templateId: UUID, userFromId: String, userToId: String): Survey

}