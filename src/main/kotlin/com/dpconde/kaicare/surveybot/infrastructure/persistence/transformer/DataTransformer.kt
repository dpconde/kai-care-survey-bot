package com.dpconde.kaicare.surveybot.infrastructure.persistence.transformer

interface DataTransformer<I, O> {

    /**
     * Transform <I> into <O>
     * @param <I> input
     * @return <O>
     */
    fun transform(input: I): O

}