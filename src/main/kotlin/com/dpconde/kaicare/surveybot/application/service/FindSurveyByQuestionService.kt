package com.dpconde.kaicare.surveybot.application.service

import com.dpconde.kaicare.surveybot.domain.Survey
import java.util.*

interface FindSurveyByQuestionService {

    /**
     * Find survey by one of its question
     * @param questionId
     * @return
     */
    fun find(questionId: UUID): Survey
}