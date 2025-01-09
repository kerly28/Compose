package cat.itb.m78.exercices.stateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.generatedFace
import org.jetbrains.compose.resources.painterResource

@Composable
fun Resource() {
    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "This is a resource string",
            color = Color.White,
        )
        Image(
            painter = painterResource(Res.drawable.generatedFace),
            modifier = Modifier
                .size(100.dp),
            contentDescription = null
        )
    }
}
