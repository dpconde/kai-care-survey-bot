package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.question

import com.dpconde.kaicare.surveybot.domain.SurveyQuestion
import com.dpconde.kaicare.surveybot.domain.SurveyQuestionAnswer
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionAnswerDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service

@Service
class QuestionToJpaTransformer(
    private val transformer: DataTransformer<SurveyQuestionAnswer, SurveyQuestionAnswerDbo>
) : DataTransformer<SurveyQuestion, SurveyQuestionDbo> {

    override fun transform(input: SurveyQuestion) = SurveyQuestionDbo(
        id = input.id.toString(),
        questionSurveyId = input.surveyId.toString(),
        text = input.text,
        selection = input.selection.let { it?.let{ transformer.transform(it) } },
        answers = input.answers.map { transformer.transform(it) }
    )
}