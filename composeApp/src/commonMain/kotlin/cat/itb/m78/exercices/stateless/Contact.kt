package cat.itb.m78.exercices.stateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.generatedFace
import org.jetbrains.compose.resources.painterResource

@Composable
fun Contact() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(Res.drawable.generatedFace),
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentDescription = null
        )
        Row(
            modifier = Modifier
                .padding(20 .dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Caitlyn",
                color = Color.White,
                fontSize = 3.em
            )
            Text(
                text = "Kiramann",
                color = Color.White,
                fontSize = 3.em
            )
        }
    }
}
