package cat.itb.m78.exercices


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cat.itb.m78.exercices.State.GoodMorningAndNight
import cat.itb.m78.exercices.State.SayHelloScreen
import cat.itb.m78.exercices.stateless.Contact
import cat.itb.m78.exercices.stateless.ContactCard
import cat.itb.m78.exercices.stateless.HelloWorld
import cat.itb.m78.exercices.stateless.Resource
import cat.itb.m78.exercices.stateless.Welcome
import cat.itb.m78.exercices.theme.AppTheme
import org.jetbrains.compose.reload.DevelopmentEntryPoint

@Composable
internal fun App() = AppTheme {
    //DEFAULT
    //Box(Modifier.fillMaxSize()){
        //Text("Your app goes here!", Modifier.align(Alignment.Center))

    //STATELESS

    //EX1
    HelloWorld()
    //EX2
    Welcome()
    //EX3
    Resource()
    //EX4
    ContactCard()
    //EX5

    //STATE

    //EX1
    //GoodMorningAndNight()
    //EX2
    SayHelloScreen()
    //EX3

    //EX4

    //VIEW MODEL

    //EX1

    //EX2

}
