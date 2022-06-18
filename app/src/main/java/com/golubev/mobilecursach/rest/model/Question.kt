package com.golubev.mobilecursach.rest.model

data class Question(
    val id: Long,
    val question: String,
    val isAdd: Boolean,
    val questionTypeId: Long
)
