package com.golubev.mobilecursach.rest.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.time.Instant

public class ResultTestDto : Serializable {

    @SerializedName("id")
    var id: Long = 0L

    @SerializedName("userId")
    var userId: Long= 0L
    @SerializedName("stuckType")
    val stuckType: Long= 0L

    @SerializedName("pedanticType")
    val pedanticType: Long= 0L

    @SerializedName("hyperthymicType")
    val hyperthymicType: Long= 0L

    @SerializedName("excitableType")
    val excitableType: Long= 0L

    @SerializedName("emotiveType")
    val emotiveType: Long= 0L

    @SerializedName("emotionallyExaltedType")
    val emotionallyExaltedType: Long= 0L

    @SerializedName("dysthymicType")
    val dysthymicType: Long= 0L

    @SerializedName("demonstrativeType")
    val demonstrativeType: Long= 0L

    @SerializedName("cyclothymicType")
    val cyclothymicType: Long= 0L

    @SerializedName("anxiouslyFearfulType")
    val anxiouslyFearfulType: Long= 0L

    @SerializedName("finishedAt")
    val finishedAt: String = ""

    override fun toString(): String {
        return "ResultTestDto(id=$id, userId=$userId, stuckType=$stuckType, pedanticType=$pedanticType, hyperthymicType=$hyperthymicType, excitableType=$excitableType, emotiveType=$emotiveType, emotionallyExaltedType=$emotionallyExaltedType, dysthymicType=$dysthymicType, demonstrativeType=$demonstrativeType, cyclothymicType=$cyclothymicType, anxiouslyFearfulType=$anxiouslyFearfulType, finishedAt='$finishedAt')"
    }
}

