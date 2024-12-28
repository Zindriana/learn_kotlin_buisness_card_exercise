package com.example.kotlin_business_card_exercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_business_card_exercise.ui.theme.Kotlin_business_card_exerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin_business_card_exerciseTheme {
                Column {
                    Column {
                        LogoImage()
                        TitleCard(title = "Testnamn", name = "testtitel")
                    }
                    Column {
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
fun TitleCard(title: String, name: String) {
    Column {
        Text(
            text = name
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
            Text(
                text = phoneNumber
            )
        }
        Row {
            Text(
                text = socialMedia
            )
        }
        Row {
            Text(
                text = email
            )
        }
    }
}

