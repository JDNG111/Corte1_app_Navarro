package com.example.corte1_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.corte1_app.navigation.NavGraph
import com.example.corte1_app.ui.theme.Corte1_appTheme
import com.example.corte1_app.viewmodel.ThemeViewModel
import com.example.corte1_app.viewmodel.ThemeViewModelFactory
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val themeViewModel: ThemeViewModel = viewModel(factory = ThemeViewModelFactory(application))
            // Se observan los estados del color seleccionado y el nombre de usuario
            val selectedColor by themeViewModel.selectedColor.collectAsState()
            val username by themeViewModel.username.collectAsState()
            // Se determina el color de fondo basado en la selección del usuario
            val backgroundColor = if (selectedColor == "Dark") Color.Black else Color.White

            Corte1_appTheme(darkTheme = (selectedColor == "Dark")) {
                Surface(
                    modifier = Modifier.fillMaxSize().background(backgroundColor)
                ) {
                    // Ejemplo de persistencia: muestra un mensaje de bienvenida con el nombre del usuario
                    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                        Text(text = "Welcome, $username!", style = MaterialTheme.typography.headlineMedium)
                        Spacer(modifier = Modifier.height(20.dp))
                        // Configura la navegación de la aplicación
                        NavGraph(context = this@MainActivity, themeViewModel)
                    }
                }
            }
        }
    }
}
