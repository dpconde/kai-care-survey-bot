package com.dpconde.kaicare.surveybot.application.usecase

import com.dpconde.kaicare.surveybot.api.usecases.SendSurveyUseCase
import com.dpconde.kaicare.surveybot.application.service.CreateSurveyFromTemplateService
import com.dpconde.kaicare.surveybot.application.service.SendQuestionService
import org.springframework.stereotype.Service
import java.util.*

@Service
class SendSurveyUseCaseImpl(
    private val createSurveyFromTemplateService: CreateSurveyFromTemplateService,
    private val sendQuestionService: SendQuestionService
): SendSurveyUseCase {

    override fun execute(templateId: UUID, thread: String, userFromId: String, userToId: String) {
        createSurveyFromTemplateService.create(templateId, userFromId, userToId).apply {
            sendQuestionService.send(this.questions[0], thread, userFromId, userToId)
        }
    }
}