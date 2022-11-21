package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.survey

import com.dpconde.kaicare.surveybot.domain.Survey
import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service

@Service
class SurveyToJpaTransformer(
    private val transformer: DataTransformer<SurveyQuestion, SurveyQuestionDbo>
) : DataTransformer<Survey, SurveyDbo> {

    override fun transform(input: Survey) = SurveyDbo(
        id = input.id.toString(),
        name = input.name,
        isTemplate = input.isTemplate,
        fromUserId = input.fromUserId,
        toUserId = input.toUserId,
        questions = input.questions.map { transformer.transform(it) }
    )
}