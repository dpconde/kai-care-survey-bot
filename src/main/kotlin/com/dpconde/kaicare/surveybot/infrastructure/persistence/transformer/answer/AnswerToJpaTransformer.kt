package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.answer

import com.dpconde.kaicare.surveybot.domain.SurveyQuestionAnswer
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionAnswerDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service

@Service
class AnswerToJpaTransformer : DataTransformer<SurveyQuestionAnswer, SurveyQuestionAnswerDbo> {

    override fun transform(input: SurveyQuestionAnswer) = SurveyQuestionAnswerDbo(
        id = input.id,
        answerSurveyId = input.surveyId,
        answerQuestionId = input.questionId,
        text = input.text,
        optionLetter = input.option
    )
}