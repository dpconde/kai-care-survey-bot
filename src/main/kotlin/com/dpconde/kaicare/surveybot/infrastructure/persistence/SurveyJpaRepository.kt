package com.dpconde.kaicare.surveybot.infrastructure.persistence

import com.dpconde.kaicare.surveybot.application.ElementNotFoundException
import com.dpconde.kaicare.surveybot.application.repository.SurveyRepository
import com.dpconde.kaicare.surveybot.domain.Survey
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dao.SurveyDao
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.survey.JpaToSurveyTransformer
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.survey.SurveyToJpaTransformer
import org.springframework.stereotype.Service
import java.util.*

@Service
class SurveyJpaRepository(
    private val dao: SurveyDao,
    private val surveyToJpaTransformer: SurveyToJpaTransformer,
    private val jpaToSurveyTransformer: JpaToSurveyTransformer
): SurveyRepository {

    override fun findAll() = dao.findAll().map { jpaToSurveyTransformer.transform(it) }

    override fun save(survey: Survey) = survey
        .let { surveyToJpaTransformer.transform(it) }
        .let {
            dao.save(it)
        }
        .let { jpaToSurveyTransformer.transform(it) }

    override fun findById(id: UUID): Survey {
        return jpaToSurveyTransformer.transform(
            dao.findById(id).orElseThrow { ElementNotFoundException("Survey with ID $id not found.") }
        )
    }
}