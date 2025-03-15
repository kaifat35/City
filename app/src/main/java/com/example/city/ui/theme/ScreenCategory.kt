package com.example.city.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.unscramble.R

@Composable
fun ScreenCityCategory(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = stringResource(R.string.Attractions), style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate(Screen.createRoute("bridges", 1))
        }) {
            Text(text = stringResource(R.string.Arkhangelsk_bridge))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("bridges", 2))
        }) {
            Text(text = stringResource(R.string.Oktyabrsky_Bridge))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("bridges", 3))
        }) {
            Text(text = stringResource(R.string.Alexandrovskaya_embankment))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("palaces", 1))
        }) {
            Text(text = stringResource(R.string.THE_PALACE_of_Chemists))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("palaces", 2))
        }) {
            Text(text = stringResource(R.string.THE_PALACE_OF_METALLURGISTS))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("palaces", 3))
        }) {
            Text(text = stringResource(R.string.Chamber_theatre))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("parks", 3))
        }) {
            Text(text = stringResource(R.string.Salt_Garden))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("parks", 1))
        }) {
            Text(text = stringResource(R.string.Victory_Park))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("parks", 2))
        }) {
            Text(text = stringResource(R.string.Komsomolsky_Park))
        }
        Button(onClick = {
            navController.navigate(Screen.createRoute("parks", 4))
        }) {
            Text(text = stringResource(R.string.Serpentine_Park))
        }
    }
}

