package com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo

import org.hibernate.annotations.Type
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "survey")
data class SurveyDbo(
    @Id @Type(type = "uuid-char") val id: UUID,
    @Column(name = "name") val name: String,
    @Column(name = "isTemplate") val isTemplate: Boolean,
    @Column(name = "fromUserId") val fromUserId: String?,
    @Column(name = "toUserID") val toUserId: String?,

    @OneToMany(mappedBy = "questionSurveyId", cascade = [CascadeType.ALL])
    val questions: List<SurveyQuestionDbo>
)