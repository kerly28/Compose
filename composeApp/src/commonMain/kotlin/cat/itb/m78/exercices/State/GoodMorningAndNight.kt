package cat.itb.m78.exercices.State

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun GoodMorningAndNight() {
    val text = remember { mutableStateOf("Good?!") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {

        Text(
            text = text.value,
            color = Color.White,
            style = TextStyle()
        )

        Button(
            onClick = { text.value = "Good Morning!" },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Good Morning")
        }

        Button(
            onClick = { text.value = "Good Night!" },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Good Night")
        }
    }
}
