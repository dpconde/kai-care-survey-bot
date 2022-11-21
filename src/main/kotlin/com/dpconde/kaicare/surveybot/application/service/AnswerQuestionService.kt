package com.dpconde.kaicare.surveybot.application.service

interface AnswerQuestionService {

    fun answer(questionId: String,  answerId: String)
}