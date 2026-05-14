package com.example.positsur.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

object MenuPrincipalScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Bueno, Bonito & Barato", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(48.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = { navigator.push(Productos) },
                    modifier = Modifier.size(120.dp, 80.dp)
                ) { Text("Registrar\nProductos") }

                Button(
                    onClick = { navigator.push(Compras) },
                    modifier = Modifier.size(120.dp, 80.dp)
                ) { Text("Registrar\nCompra") }

                Button(
                    onClick = { navigator.push(ReporteMensual) },
                    modifier = Modifier.size(120.dp, 80.dp)
                ) { Text("Reporte\nMensual") }
            }
        }
    }
}
