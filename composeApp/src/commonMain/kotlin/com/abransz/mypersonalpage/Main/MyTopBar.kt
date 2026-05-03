package com.abransz.mypersonalpage.Main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.abransz.theme.ThemeColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(modifier: Modifier = Modifier) {

    TopAppBar(
        title = {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Joseph Nieves",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onPrimary
                )

                Row(Modifier.weight(2f), horizontalArrangement = Arrangement.Center) {
                    TextButton(onClick = {}) { Text("Projects", color = MaterialTheme.colorScheme.onSecondary, textAlign = TextAlign.Center) }
                    TextButton(onClick = {}) { Text("Stacks", color = MaterialTheme.colorScheme.onSecondary, textAlign = TextAlign.Center) }
                    TextButton(onClick = {}) { Text("Contact me", color = MaterialTheme.colorScheme.onSecondary, textAlign = TextAlign.Center) }
                }

                Box(Modifier.weight(1f), contentAlignment = Alignment.CenterEnd) {

                    Button(
                        onClick = {},
                        shape = ButtonDefaults.shape
                    )
                    { Text("Resume") }
                }
            }

        },
        colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.surface)
    )


}
