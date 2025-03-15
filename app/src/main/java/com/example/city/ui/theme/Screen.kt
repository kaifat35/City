package com.example.city.ui.theme

sealed class Screen(val route: String) {
    object CityApp : Screen("city_app")
    object CityContentList : Screen("city_content_list/{category}/{id}")
    object CityRecommendation : Screen("cityRecommendation")
    object CityCategory : Screen("cityCategory")
    // Вспомогательная функция для создания маршрута с аргументами
    companion object {
        fun createRoute(category: String, id: Int): String {
            return "city_content_list/$category/$id"
        }
    }
}