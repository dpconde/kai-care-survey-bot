package com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo

import javax.persistence.*

@Entity
@Table(name = "survey_question")
data class SurveyQuestionDbo(
    @Id var id: String,
    @Column(name = "text") val text: String,
    @Column(name = "questionSurveyId") val questionSurveyId: String,

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="selectionId", nullable=true)
    val selection: SurveyQuestionAnswerDbo?,

    @OneToMany(mappedBy = "answerQuestionId", cascade = [CascadeType.ALL])
    val answers: List<SurveyQuestionAnswerDbo>
)