package com.ashraf.compozer

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

class Compozer {


    @Composable
    fun Compoze() {
        val text = Textt("Hello from server UI", 24)

        when (text) {
            is Textt -> {
                Text(text = text.value, fontSize = text.fontSize.sp)
            }
            else -> {

            }
        }
    }
}