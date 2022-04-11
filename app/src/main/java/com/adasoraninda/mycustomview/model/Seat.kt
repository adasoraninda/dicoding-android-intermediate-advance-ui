package com.adasoraninda.mycustomview.model

data class Seat(
    val id: Int,
    var x: Float? = 0f,
    var y: Float? = 0f,
    val name: String,
    var isBooked: Boolean = false,
)