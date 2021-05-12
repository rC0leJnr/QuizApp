package com.rick.quizapp.model

import androidx.annotation.StringRes

data class Question (
    @StringRes val  textResId: Int,
    val answer: Boolean
)
/*

@StringRes annotation is not required, but the annotation helps the code inspector built into Android
Studio(Lint) verify at compile time that usages of the constructor provide a valid string
resource ID. This prevents runtime crashes where the constructor is used with an invaled resource
Id (such as an ID that points to some resource other than a string)
        */
