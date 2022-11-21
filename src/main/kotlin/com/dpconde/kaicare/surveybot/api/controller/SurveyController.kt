package com.dpconde.kaicare.surveybot.api.controller

import com.dpconde.kaicare.surveybot.api.usecases.ManageAnswerUseCase
import com.dpconde.kaicare.surveybot.api.usecases.SendSurveyUseCase
import com.dpconde.kaicare.surveybot.application.ElementNotFoundException
import com.dpconde.kaicare.surveybot.application.InvalidTemplateException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api")
class SurveyController(
    private val sendSurveyUseCase: SendSurveyUseCase,
    private val manageAnswerUseCase: ManageAnswerUseCase
) {

    @GetMapping(value = ["sendSurvey"])
    suspend fun sendSurvey(): ResponseEntity<Any> {
        return try {
            sendSurveyUseCase.execute(
                templateId = UUID.fromString("8d7e7a84-5850-4427-8803-000c1f435d9c"),
                thread = "KinKHi4GW2Ch3lEGRf50",
                userFromId = "4JT3j7B2VucBUfQ3jbJzMZovuPY2",
                userToId = "rJ3TrTbCpNNvsCTjfFHV4ZdCCqF3")

            ResponseEntity.ok(Unit)

        }catch (ex: Exception){
            ex.printStackTrace()
            when(ex){
                is ElementNotFoundException,
                is InvalidTemplateException -> {
                    ResponseEntity.badRequest().body(ex.message)
                }
                else -> ResponseEntity.internalServerError().build()
            }
        }
    }

    @GetMapping(value = ["answerQuestion"])
    suspend fun answerQuestion(): ResponseEntity<Any> {
        return try {
            manageAnswerUseCase.execute(
                questionId = UUID.fromString("0a7d0da3-0bd3-4cb8-afe0-fccaf5658a4a"),
                answerId = UUID.fromString("f3fcc16b-c8ab-4514-ae50-046359c88a50"))

            ResponseEntity.ok(Unit)

        }catch (ex: Exception){
            ex.printStackTrace()
            when(ex){
                is ElementNotFoundException,
                is InvalidTemplateException -> {
                    ResponseEntity.badRequest().body(ex.message)
                }
                else -> ResponseEntity.internalServerError().build()
            }
        }
    }
}