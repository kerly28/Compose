package cat.itb.m78.exercices.State

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*

@Composable
fun SayHelloScreen() {
    var name by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }

    Column {
        // Campo de texto para que el usuario ingrese su nombre
        Text(text = "Name")
        BasicTextField(
            value = name,
            onValueChange = { name = it },
        )


        Button(onClick = {
            if (name.isNotEmpty()) {
                showDialog = true
            }
        }) {
            Text(text = "Say Hello")
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                text = { Text("Hello $name!") },
                confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text("OK")
                    }
                }
            )
        }
    }
}


