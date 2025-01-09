package cat.itb.m78.exercices.stateless

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Welcome() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Welcome", color = Color.White)
        Text("Start learning now", color = Color.White)

        // Agregar un Spacer para dejar espacio entre los textos y los botones
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {}) {
            Text("Login")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = {}) {
            Text("Register")
        }
    }
}
