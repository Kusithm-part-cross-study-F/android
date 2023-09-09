package com.kusitms.partcrossteamf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kusitms.partcrossteamf.ui.HomeScreen
import com.kusitms.partcrossteamf.ui.theme.PartCrossTeamFTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PartCrossTeamFTheme {
                FApp()
            }
        }
    }
}

@Composable
fun FApp() {
    val navController = rememberNavController()
    // viewModel
    NavHostScreen(navController = navController)
}

@Composable
fun NavHostScreen(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.name) {
        composable(Screen.Home.name) {
            HomeScreen(
                onClickCreate = {
                    navController.navigate(Screen.Create.name)
                },
                onClickDetailed = {
                    navController.navigate(Screen.Detail.name)
                }
            )
        }
        composable(Screen.Create.name) {
            // todo
        }
        composable(Screen.Detail.name) {
            // todo
        }
    }
}

enum class Screen {
    Home, Create, Detail
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PartCrossTeamFTheme {
        HomeScreen({}, {})
    }
}