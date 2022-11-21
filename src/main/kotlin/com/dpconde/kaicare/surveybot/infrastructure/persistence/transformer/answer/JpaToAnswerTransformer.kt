package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.answer

import com.dpconde.kaicare.surveybot.domain.SurveyQuestionAnswer
import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionAnswerDbo
import com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer.DataTransformer
import org.springframework.stereotype.Service
import java.util.*

@Service
class JpaToAnswerTransformer: DataTransformer<SurveyQuestionAnswerDbo, SurveyQuestionAnswer> {

    override fun transform(input: SurveyQuestionAnswerDbo) = SurveyQuestionAnswer(
        id = UUID.fromString(input.id),
        surveyId = UUID.fromString(input.answerSurveyId),
        questionId = UUID.fromString(input.answerQuestionId),
        option = input.optionLetter,
        text = input.text
    )
}