package com.dpconde.kaicare.surveybot.infrastructure.persistence

import com.dpconde.kaicare.surveybot.application.ElementNotFoundException
import com.dpconde.kaicare.surveybot.application.repository.SurveyQuestionRepository
import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dao.SurveyQuestionDao
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service
import java.util.*

@Service
class SurveyQuestionJpaRepository(
    private val dao: SurveyQuestionDao,
    private val surveyQuestionToJpaTransformer: DataTransformer<SurveyQuestion, SurveyQuestionDbo>,
    private val jpaToSurveyQuestionTransformer: DataTransformer<SurveyQuestionDbo, SurveyQuestion>
): SurveyQuestionRepository {

    override fun answerQuestion(questionId: String, answerId: String) = dao.answerQuestion(questionId, answerId)

    override fun findAll() = dao.findAll().map { jpaToSurveyQuestionTransformer.transform(it) }

    override fun save(element: SurveyQuestion) = element
        .let { surveyQuestionToJpaTransformer.transform(it) }
        .let { dao.save(it) }
        .let { jpaToSurveyQuestionTransformer.transform(it) }

    override fun findById(id: UUID): SurveyQuestion {
        return jpaToSurveyQuestionTransformer.transform(
            dao.findById(id.toString()).orElseThrow { ElementNotFoundException("SurveyQuestion with ID $id not found.") }
        )
    }
}