package com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "survey_question_answer")
data class SurveyQuestionAnswerDbo(
    @Id var id: String,
    @Column(name = "answerSurveyId") val answerSurveyId: String,
    @Column(name = "text") val text: String,
    @Column(name = "optionLetter") val optionLetter: String,
    @Column(name = "answerQuestionId") val answerQuestionId: String

)