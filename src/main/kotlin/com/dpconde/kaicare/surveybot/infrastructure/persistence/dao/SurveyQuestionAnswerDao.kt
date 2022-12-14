package com.dpconde.kaicare.surveybot.infrastructure.persistence.dao

import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionAnswerDbo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
interface SurveyQuestionAnswerDao: CrudRepository<SurveyQuestionAnswerDbo, String>