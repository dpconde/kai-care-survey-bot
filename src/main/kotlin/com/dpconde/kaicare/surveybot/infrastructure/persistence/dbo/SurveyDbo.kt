package com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo

import javax.persistence.*

@Entity
@Table(name = "survey")
data class SurveyDbo(
    @Id val id: String,
    @Column(name = "name") val name: String,
    @Column(name = "isTemplate") val isTemplate: Boolean,
    @Column(name = "fromUserId") val fromUserId: String?,
    @Column(name = "toUserID") val toUserId: String?,

    @OneToMany(mappedBy = "questionSurveyId", cascade = [CascadeType.ALL])
    val questions: List<SurveyQuestionDbo>
)