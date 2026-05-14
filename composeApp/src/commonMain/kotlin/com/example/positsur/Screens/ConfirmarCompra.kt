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

object ConfirmarCompra : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column(modifier = Modifier.fillMaxSize()) {
            BotonVolver()

            Column(modifier = Modifier.fillMaxWidth().weight(1f).padding(16.dp)) {
                Text("Tu Compra", fontSize = 28.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(modifier = Modifier.height(32.dp))

                Text("", fontSize = 18.sp)
                Text("", fontSize = 18.sp)
                Divider(modifier = Modifier.padding(vertical = 16.dp))
                Text("Total:", fontSize = 24.sp, modifier = Modifier.align(Alignment.End))
            }

            Box(modifier = Modifier.fillMaxWidth().padding(16.dp), contentAlignment = Alignment.BottomCenter) {
                Button(
                    onClick = {
                        navigator.popUntilRoot()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green, contentColor = Color.White),
                    modifier = Modifier.fillMaxWidth().height(50.dp)
                ) {
                    Text("Comprar (Finalizar)")
                }
            }
        }
    }
}
