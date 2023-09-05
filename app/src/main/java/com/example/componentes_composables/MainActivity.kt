package com.example.componentes_composables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.componentes_composables.ui.theme.Componentes_composablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Componentes_composablesTheme {
                // A surface container using the 'background' color from the them
                    App()
                SimpleForm()

            }
        }
    }
}


@Composable
fun App() {
   Componentes_composablesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            // A Barra de navegação ficará visível na parte superior através da função SimpleBottomAppBar
            SimpleBottomAppBar()
            // Botão de confirmação que ficará visível na parte inferior da interface

            SimpleForm()
        }
    }
}



@Composable
fun SimpleBottomAppBar() {
    BottomAppBar {
        IconButton(onClick = { /* doSomething() */ }) {
            Icon(Icons.Filled.Menu, contentDescription = "Localized description")
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleForm() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Adiciona um espaçamento externo
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tela de Login",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Formulário simples
        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Nome") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Senha") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        Button(
            onClick = { /* Implemente a lógica do botão aqui */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Icon(
                Icons.Filled.Done,
                contentDescription = "Localized description",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Text("Validar")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun SimpleBottomPreview() {
    Componentes_composablesTheme {
        SimpleBottomAppBar()

    }
}



@Preview(showBackground = true)
@Composable
fun SimpleFormPreview() {
    Componentes_composablesTheme {
        SimpleForm()
    }
}
