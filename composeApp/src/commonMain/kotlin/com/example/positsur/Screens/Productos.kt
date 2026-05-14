package com.example.positsur.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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

object Productos : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val ListaDeProductos = listOf("")

        Column(modifier = Modifier.fillMaxSize()) {
            BotonVolver()

            Text("Productos", fontSize = 28.sp, modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 16.dp))

            LazyColumn(modifier = Modifier.fillMaxWidth().weight(1f).padding(16.dp)) {
                items(ListaDeProductos) { producto ->
                    Button(
                        onClick = { navigator.push(item = ActualizarProducto(nombreProducto = producto))
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    ) {
                        Text("Actualizar $producto")
                    }
                }
            }

            Box(modifier = Modifier.fillMaxWidth().padding(16.dp), contentAlignment = Alignment.BottomEnd) {
                Button(
                    onClick = { navigator.push(AgregarProducto) },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green, contentColor = Color.White)
                ) {
                    Text("+ Agregar", fontSize = 20.sp)
                }
            }

        }
    }
}
