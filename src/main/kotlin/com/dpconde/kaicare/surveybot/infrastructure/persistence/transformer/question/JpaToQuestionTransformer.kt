package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.question

import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import com.dpconde.kaicare.surveybot.domain.SurveyQuestionAnswer
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionAnswerDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service

@Service
class JpaToQuestionTransformer(
    private val transformer: DataTransformer<SurveyQuestionAnswerDbo, SurveyQuestionAnswer>
) : DataTransformer<SurveyQuestionDbo, SurveyQuestion> {

    override fun transform(input: SurveyQuestionDbo) = SurveyQuestion(
        id = input.id,
        surveyId = input.questionSurveyId,
        text = input.text,
        selection = input.selection.let { it?.let { transformer.transform(it) } },
        answers = input.answers.map { transformer.transform(it) }
    )
}