package com.kusitms.partcrossteamf.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.kusitms.partcrossteamf.model.Article
import com.kusitms.partcrossteamf.ui.theme.Typography

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Blog", style = Typography.titleLarge)
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Create, contentDescription = "글 작성하기")
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(28.dp)
        )
        ArticleContents()
    }
}

val list = listOf<Article>(
    Article(
        0,
        "즐거운 개발 시간",
        "description description description description",
        "super shy super shy super shy super shy super shy ",
        listOf("healthy, happy, smile"),
        "",
        ""
    )
)

@Composable
fun ArticleContents() {
    val articles = remember {
        list
    }
    LazyColumn() {
        items(
            items = articles,
            itemContent = { ArticleListItem(it) }
        )
    }
}

@Composable
fun ArticleListItem(article: Article) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        shape = RoundedCornerShape(corner = CornerSize(4.dp)),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)

    ) {
        Column(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
        ) {
            Text(
                text = article.title,
                style = Typography.titleSmall,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = article.body,
                style = Typography.bodySmall,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

    }
}