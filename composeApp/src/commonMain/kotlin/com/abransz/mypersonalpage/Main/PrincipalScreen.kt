package com.abransz.mypersonalpage.Main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LandingPage() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { MyTopBar() },
        containerColor = MaterialTheme.colorScheme.background,

        ) { innerPadding ->

        LazyColumn(
            Modifier.fillMaxSize().padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            item { Text("Android & KMP Engeneer", fontSize = 18.sp, color = MaterialTheme.colorScheme.onSecondary) }
            item { Modifier.height(15.dp) }
            item { Text("Joseph Nieves", fontSize = 60.sp) }
            item { Modifier.height(15.dp) }
            item {
                Text(
                    "Architecting fluid, cross-platform mobile experiences with \n Kotlin Multiplatform and Jetpack Compose. Focused on performance,\n precision, and the future of Android.",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
            item { Spacer(Modifier.height(24.dp)) }

            item {
                Row(horizontalArrangement = Arrangement.Center,modifier = Modifier.fillMaxWidth()) {
                    Button(onClick = {}) {
                        Text("Explore Work")
                    }
                    Spacer(Modifier.width(10.dp))
                    OutlinedButton(onClick = {}, colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.secondary)) {
                        Text("Technical Task")
                    }
                }
            }

        }
    }
}


