package com.dpconde.kaicare.surveybot.application.service.impl

import com.dpconde.kaicare.surveybot.application.repository.SurveyQuestionRepository
import com.dpconde.kaicare.surveybot.application.repository.SurveyRepository
import com.dpconde.kaicare.surveybot.application.service.FindSurveyByQuestionService
import org.springframework.stereotype.Service
import java.util.*

@Service
class FindSurveyByQuestionServiceImpl(
    private val surveyRepository: SurveyRepository,
    private val questionRepository: SurveyQuestionRepository
): FindSurveyByQuestionService {

    override fun find(questionId: UUID) =
         questionRepository.findById(questionId).let { surveyRepository.findById(it.surveyId) }
}