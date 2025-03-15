package com.example.city.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.city.data.Bridges
import com.example.city.data.Palaces
import com.example.city.data.Parks
import com.example.unscramble.R

@Composable
fun ScreenCityContentList(
    navController: NavController,
    viewModel: CityViewModel,
    category: String,
    id: Int
) {

    // Получение данных из ViewModel
    val parks by viewModel.parks.collectAsState()
    val bridges by viewModel.bridges.collectAsState()
    val palaces by viewModel.palaces.collectAsState()

    // Поиск выбранной достопримечательности
    val selectedItem = when (category) {
        "parks" -> parks.find { it.id == id }
        "bridges" -> bridges.find { it.id == id }
        "palaces" -> palaces.find { it.id == id }
        else -> null
    }
    // Отображение выбранной достопримечательности
    if (selectedItem != null) {
        when (selectedItem) {
            is Parks -> {
                CityItem(
                    imageResourceId = selectedItem.imageResourceId,
                    titleResourceId = stringResource(selectedItem.titleResourceId),
                    cityDetails = stringResource(selectedItem.cityDetails),
                    onClick = { navController.navigate(Screen.CityRecommendation.route) }
                )
            }
            is Bridges -> {
                CityItem(
                    imageResourceId = selectedItem.imageResourceId,
                    titleResourceId = stringResource(selectedItem.titleResourceId),
                    cityDetails = stringResource(selectedItem.cityDetails),
                    onClick = { navController.navigate(Screen.CityRecommendation.route) }
                )
            }
            is Palaces -> {
                CityItem(
                    imageResourceId = selectedItem.imageResourceId,
                    titleResourceId = stringResource(selectedItem.titleResourceId),
                    cityDetails = stringResource(selectedItem.cityDetails),
                    onClick = { navController.navigate(Screen.CityRecommendation.route) }
                )
            }
        }
    } else {
        Text("Достопримечательность не найдена", style = MaterialTheme.typography.bodyMedium)
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
                Text(text = stringResource(R.string.more_detailed))
            }
        }
    }
}