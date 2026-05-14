package com.example.positsur.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

object Compras : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column(modifier = Modifier.fillMaxSize()) {
            BotonVolver()

            Text("Comprar", fontSize = 28.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.weight(1f))

            Box(modifier = Modifier.fillMaxWidth().padding(16.dp), contentAlignment = Alignment.BottomEnd) {
                Button(
                    onClick = { navigator.push(ConfirmarCompra) },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green, contentColor = Color.White)
                ) {
                    Text("Ir a Tu Compra ->")
                }
            }
        }
    }
}
