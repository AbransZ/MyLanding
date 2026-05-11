package com.abransz.mypersonalpage.Main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ProjectsScreen() {
    Box(Modifier.fillMaxSize().padding(4.dp), contentAlignment = Alignment.Center) {
        Card(elevation = CardDefaults.cardElevation(10.dp)) { Text("Projects", Modifier.padding(6.dp)) }
    }
}