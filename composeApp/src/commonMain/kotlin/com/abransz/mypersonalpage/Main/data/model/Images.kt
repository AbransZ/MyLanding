package com.abransz.mypersonalpage.Main.data.model

import androidx.compose.ui.graphics.vector.ImageVector

sealed class Images(
    val title: String,
    val image: ImageVector
) {
}