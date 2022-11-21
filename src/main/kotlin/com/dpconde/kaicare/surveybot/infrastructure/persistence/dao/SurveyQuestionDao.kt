package com.dpconde.kaicare.surveybot.infrastructure.persistence.dao

import com.dpconde.kaicare.surveybot.infrastructure.persistence.dbo.SurveyQuestionDbo
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
interface SurveyQuestionDao: CrudRepository<SurveyQuestionDbo, String>{

    @Modifying
    @Query("update SurveyQuestionDbo q set q.selection.id = :answerId where q.id = :questionId")
    fun answerQuestion(questionId: String, answerId: String)
}