package com.golubev.mobilecursach.rest.request

import com.google.gson.annotations.SerializedName

data class ResetPassDto(
    @SerializedName("mail")
    var mail: String
)
