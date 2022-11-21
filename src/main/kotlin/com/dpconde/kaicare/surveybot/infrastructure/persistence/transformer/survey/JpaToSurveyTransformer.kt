package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.survey

import com.dpconde.kaicare.surveybot.domain.Survey
import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service
import java.util.*

@Service
class JpaToSurveyTransformer(
    private val transformer: DataTransformer<SurveyQuestionDbo, SurveyQuestion>
) : DataTransformer<SurveyDbo, Survey> {

    override fun transform(input: SurveyDbo) = Survey(
        id = UUID.fromString(input.id),
        name = input.name,
        threadId = input.threadId,
        isTemplate = input.isTemplate,
        fromUserId = input.fromUserId,
        toUserId = input.toUserId,
        questions = input.questions.map { transformer.transform(it) })
}