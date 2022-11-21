package com.dpconde.kaicare.surveybot.application.repository

import com.dpconde.kaicare.surveybot.domain.SurveyQuestion


interface SurveyQuestionRepository: Repository<SurveyQuestion>{

    /**
     * Link a question with an answer
     * @param questionId
     * @param answerId
     */
    fun answerQuestion(questionId: String, answerId: String)

}