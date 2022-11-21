package com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "survey_question_answer")
data class SurveyQuestionAnswerDbo(
    @Id @Type(type = "uuid-char") var id: UUID,
    @Column(name = "answerSurveyId") val answerSurveyId: UUID,
    @Column(name = "text") val text: String,
    @Column(name = "optionLetter") val optionLetter: String,
    @Column(name = "answerQuestionId") val answerQuestionId: UUID

)