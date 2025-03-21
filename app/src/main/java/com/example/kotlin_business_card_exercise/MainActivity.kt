package com.example.kotlin_business_card_exercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.kotlin_business_card_exercise.ui.theme.Kotlin_business_card_exerciseTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin_business_card_exerciseTheme {
                Column {
                    Column (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        LogoImage()
                        TitleCard(title = "Testnamn", name = "testtitel")
                    }
                    Column (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        ContactInfo(phoneNumber = "0712345678", socialMedia = "testur", email = "test@test.se")
                    }
                }
            }
        }
    }
}

@Composable
fun LogoImage() {
    val image = painterResource(R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null
    )
}

@Composable
fun IconExample() {
    Icon(
        imageVector = Icons.Filled.Favorite,
        contentDescription = "Favorite Icon"
    )
}


@Composable
fun TitleCard(title: String, name: String) {
    Column {
        Text(
            text = name,
            color = Color(0xFF3ddc84)
        )
        Text(
            text = title
        )
    }
}

@Composable
fun ContactInfo(phoneNumber: String, socialMedia: String, email: String) {
    Column {
        Row {
            IconExample()
            Text(
                text = phoneNumber
            )
        }
        Row {
            IconExample()
            Text(
                text = socialMedia
            )
        }
        Row {
            IconExample()
            Text(
                text = email
            )
        }
    }
}

