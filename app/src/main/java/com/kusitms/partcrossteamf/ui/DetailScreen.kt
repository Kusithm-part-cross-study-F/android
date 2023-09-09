package com.kusitms.partcrossteamf.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kusitms.partcrossteamf.model.GetAllArticle
import com.kusitms.partcrossteamf.ui.theme.Typography

// todo viewModel에서 받아오기
val article = GetAllArticle(
    0,
    "즐거운 개발 시간",
    "description description description description",
    "super shy super shy super shy super shy super shy ",
    listOf("healthy, happy, smile"),
    "",
    ""
)

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(onClickBackBtn : () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detail" )},
                navigationIcon = {
                    IconButton(onClick = { onClickBackBtn }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "뒤로가기")
                    }
                }
            ) },
        content = {
            Column (
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
            ) {
                Contents()
            }
        }
    )

}

@Composable
fun Contents() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        Column {
            Text(text = "제목", style = Typography.bodyMedium)
            Text(text = article.title, style = Typography.titleMedium)
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        )
        Column {
            Text(text = "내용", style = Typography.bodyMedium)
            Text(text = article.body, style = Typography.bodyLarge)
        }
    }
}