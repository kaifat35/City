package com.example.city.ui.theme

sealed class Screen(val route: String) {
    object CityApp : Screen("city_app")
    object CityContentList : Screen("city_content_list")
    object CityRecommendation : Screen("cityRecommendation")
}