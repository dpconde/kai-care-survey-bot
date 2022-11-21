package com.dpconde.kaicare.surveybot.application.repository

import java.util.*

interface Repository<T> {

    fun findAll(): List<T>

    fun save(element: T): T

    fun findById(id: UUID): T

}