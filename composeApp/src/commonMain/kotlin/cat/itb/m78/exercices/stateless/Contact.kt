package cat.itb.m78.exercices.stateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
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

// Data class de Contacto
data class Contact(val fullName: String, val email: String, val phone: String)

@Composable
fun ContactCard() {
    // Definir el contacto dentro de la función ContactCard
    val contact = Contact("Marta Casserres", "marta@example.com", "934578484")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Imagen circular
        Image(
            painter = painterResource(Res.drawable.generatedFace),
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentDescription = null
        )

        // Nombre completo de la persona
        Row(
            modifier = Modifier
                .padding(20.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            val nameParts = contact.fullName.split(" ")
            if (nameParts.size > 1) {
                Text(
                    text = nameParts[0], // Primer nombre
                    color = Color.White,
                    fontSize = 3.em
                )
                Text(
                    text = nameParts[1], // Apellido
                    color = Color.White,
                    fontSize = 3.em
                )
            }
        }

        // Fondo opaco y detalles de contacto (teléfono y correo)
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
                .background(Color.Gray),
            shape = CircleShape
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Número de teléfono
                Text(
                    text = "Teléfono: ${contact.phone}",
                    color = Color.White,
                    fontSize = 1.5.em
                )
                Spacer(modifier = Modifier.height(8.dp)) // Espacio entre los elementos
                // Correo electrónico
                Text(
                    text = "Correo: ${contact.email}",
                    color = Color.White,
                    fontSize = 1.5.em
                )
            }
        }
    }
}
