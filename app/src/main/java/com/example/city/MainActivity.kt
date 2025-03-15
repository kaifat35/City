package com.example.city

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.city.ui.theme.CityViewModel
import com.example.city.ui.theme.Screen
import com.example.city.ui.theme.ScreenCityApp
import com.example.city.ui.theme.ScreenCityCategory
import com.example.city.ui.theme.ScreenCityContentList
import com.example.city.ui.theme.ScreenRecommendationCity

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val windowSizeClass = calculateWindowSizeClass(this)
            CityApp(windowSizeClass)
        }
    }
}


@Composable
fun CityApp(windowSizeClass: WindowSizeClass) {
    val navController = rememberNavController()
    val viewModel: CityViewModel = viewModel()
    // Используем AdaptiveUI для адаптации интерфейса
    AdaptiveUI(windowSizeClass)

    NavHost(navController = navController, startDestination = Screen.CityApp.route) {
        composable(Screen.CityApp.route) { ScreenCityApp(navController, windowSizeClass) }
        composable(Screen.CityCategory.route) { ScreenCityCategory(navController) }
        composable(
            route = Screen.CityContentList.route,
            arguments = listOf(
                navArgument("category") { type = NavType.StringType },
                navArgument("id") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            val id = backStackEntry.arguments?.getInt("id") ?: 0
            ScreenCityContentList(navController, viewModel,category, id)
        }
        composable(Screen.CityRecommendation.route) { ScreenRecommendationCity(navController) }
    }
}

@Composable
fun AdaptiveUI(windowSizeClass: WindowSizeClass) {
    when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> SmallScreen()
        WindowWidthSizeClass.Medium -> MediumScreen()
        WindowWidthSizeClass.Expanded -> LargeScreen()
    }
}

@Composable
fun SmallScreen() {
    // UI для маленьких экранов
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("", style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun MediumScreen() {
    // UI для средних экранов
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("", style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun LargeScreen() {
    // UI для больших экранов
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("", style = MaterialTheme.typography.bodyMedium)
    }
}




