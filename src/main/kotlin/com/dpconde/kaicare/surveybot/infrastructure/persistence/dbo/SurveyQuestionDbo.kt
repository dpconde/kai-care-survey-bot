package com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "survey_question")
data class SurveyQuestionDbo(
    @Id @Type(type = "uuid-char") var id: UUID,
    @Column(name = "text") val text: String,
    @Column(name = "questionSurveyId") val questionSurveyId: UUID,

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="selectionId", nullable=true)
    val selection: SurveyQuestionAnswerDbo?,

    @OneToMany(mappedBy = "answerQuestionId", cascade = [CascadeType.ALL])
    val answers: List<SurveyQuestionAnswerDbo>
)