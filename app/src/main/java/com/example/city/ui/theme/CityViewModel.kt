package com.example.city.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.city.data.Bridges
import com.example.city.data.LocalMyCity
import com.example.city.data.Palaces
import com.example.city.data.Parks
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CityViewModel : ViewModel() {
    private val _parks = MutableStateFlow<List<Parks>>(emptyList())
    val parks: StateFlow<List<Parks>> get() = _parks

    private val _bridges = MutableStateFlow<List<Bridges>>(emptyList())
    val bridges: StateFlow<List<Bridges>> get() = _bridges

    private val _palaces = MutableStateFlow<List<Palaces>>(emptyList())
    val palaces: StateFlow<List<Palaces>> get() = _palaces

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            _parks.value = LocalMyCity.getCityParks()
            _bridges.value = LocalMyCity.getCityBridges()
            _palaces.value = LocalMyCity.getCityPalaces()
        }
    }
}
