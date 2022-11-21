package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.answer

import com.dpconde.kaicare.surveybot.domain.SurveyQuestionAnswer
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionAnswerDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service

@Service
class JpaToAnswerTransformer: DataTransformer<SurveyQuestionAnswerDbo, SurveyQuestionAnswer> {

    override fun transform(input: SurveyQuestionAnswerDbo) = SurveyQuestionAnswer(
        id = input.id,
        surveyId = input.answerSurveyId,
        questionId = input.answerQuestionId,
        option = input.optionLetter,
        text = input.text
    )
}