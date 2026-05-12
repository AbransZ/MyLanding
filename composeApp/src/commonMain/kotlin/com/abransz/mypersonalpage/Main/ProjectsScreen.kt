package com.abransz.mypersonalpage.Main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abransz.mypersonalpage.Main.data.model.Images
import mypersonalpage.composeapp.generated.resources.Res
import mypersonalpage.composeapp.generated.resources._01
import mypersonalpage.composeapp.generated.resources._02
import mypersonalpage.composeapp.generated.resources._03
import org.jetbrains.compose.resources.painterResource


@Preview(showBackground = true)
@Composable
fun ProjectsScreen() {
    Box(Modifier.fillMaxSize().padding(4.dp), contentAlignment = Alignment.Center) {
        Column (Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Selected Projects", fontSize = 40.sp, fontWeight = FontWeight.Bold)
                Divider(
                    color = MaterialTheme.colorScheme.onSecondary,
                    thickness = 2.dp,
                    modifier = Modifier.padding(horizontal = 10.dp)
                )

            }

            Spacer(Modifier.height(20.dp))


            Card(Modifier.fillMaxWidth().padding(2.dp)) {

                val imageList = listOf(
                    Res.drawable._01,
                    Res.drawable._02,
                    Res.drawable._03

                )

                val pager = rememberPagerState(
                    initialPage = 0,
                    pageCount = { imageList.size },

                    )

                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {

                    Column {
                        HorizontalPager(
                            state = pager,
                            Modifier.weight(1f)
                        ) { page ->

                            Image(
                                painterResource(imageList[page]),
                                "carrousel")
                        }

                    }
                    Column(Modifier.fillMaxWidth()) {Text("Bases de finandia") }
                }
            }

        }
    }
}

