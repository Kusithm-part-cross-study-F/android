package com.kusitms.partcrossteamf.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateScreen(onClickBackBtn : () -> Unit){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Create" ) },
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
                CreateContents()
            }
        }
    )
}

@Composable
fun CreateContents(){

}