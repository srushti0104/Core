package com.example.coreservice

fun interface UpdateNetwork {
    fun onUpdate(isConnected: Boolean)
}