package com.example.positsur.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

data class ActualizarProducto(val nombreProducto: String) : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        var nombre by remember { mutableStateOf(nombreProducto) }
        var precio by remember { mutableStateOf("") }

        Column(modifier = Modifier.fillMaxSize()) {
            BotonVolver()

            Column(
                modifier = Modifier.fillMaxWidth().weight(1f).padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Actualizar Producto", fontSize = 28.sp, modifier = Modifier.padding(bottom = 32.dp))

                OutlinedTextField(
                    value = nombre,
                    onValueChange = { nombre = it },
                    label = { Text("Nombre del Producto") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
                )

                OutlinedTextField(
                    value = precio,
                    onValueChange = { precio = it },
                    label = { Text("Precio") },
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Box(modifier = Modifier.fillMaxWidth().padding(32.dp), contentAlignment = Alignment.BottomCenter) {
                Button(
                    onClick = { navigator.pop() },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green, contentColor = Color.White),
                    modifier = Modifier.fillMaxWidth().height(50.dp)
                ) {
                    Text("Actualizar")
                }
            }
        }
    }
}
