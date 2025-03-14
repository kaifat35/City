package com.example.city.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun ScreenCityContentList(navController: NavController, viewModel: CityViewModel, windowSizeClass: WindowSizeClass) {
    val parks by viewModel.parks.collectAsState()
    val bridges by viewModel.bridges.collectAsState()
    val palaces by viewModel.palaces.collectAsState()

    val columns = when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> 1 // Одна колонка для маленьких экранов
        WindowWidthSizeClass.Medium -> 2 // Две колонки для средних экранов
        else -> 3 // Три колонки для больших экранов
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(columns),
        modifier = Modifier.fillMaxSize()
    ) {
        items(parks.size) { index ->
            val park = parks[index]
            CityItem(
                imageResourceId = park.imageResourceId,
                titleResourceId = stringResource(park.titleResourceId),
                cityDetails = stringResource(park.cityDetails),
                onClick = { navController.navigate(Screen.CityRecommendation.route) }
            )
        }
        items(bridges.size) { index ->
            val bridge = bridges[index]
            CityItem(
                imageResourceId = bridge.imageResourceId,
                titleResourceId = stringResource(bridge.titleResourceId),
                cityDetails = stringResource(bridge.cityDetails),
                onClick = { navController.navigate(Screen.CityRecommendation.route) }
            )
        }
        items(palaces.size) { index ->
            val palace = palaces[index]
            CityItem(
                imageResourceId = palace.imageResourceId,
                titleResourceId = stringResource(palace.titleResourceId),
                cityDetails = stringResource(palace.cityDetails),
                onClick = { navController.navigate(Screen.CityRecommendation.route) }
            )
        }
    }
}
@Composable
fun CityItem(imageResourceId: Int ,titleResourceId: String, cityDetails: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(painter = painterResource(imageResourceId),
                contentDescription = null,
                alignment = Alignment.TopCenter,
                contentScale = ContentScale.FillWidth)
            Text(titleResourceId, style = MaterialTheme.typography.bodyMedium)
            Text(cityDetails, style = MaterialTheme.typography.bodyMedium)
            Button(onClick = onClick) {
                Text("Подробнее")
            }
        }
    }
}