package com.dpconde.kaicare.surveybot.infrastructure.persistence.dao

import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionDbo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
interface SurveyQuestionDao: CrudRepository<SurveyQuestionDbo, UUID>