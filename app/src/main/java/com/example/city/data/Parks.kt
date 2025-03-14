package com.example.city.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Parks(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val cityDetails: Int
)
data class Bridges(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val cityDetails: Int
)
data class Palaces(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val cityDetails: Int
)
/*data class Content(
    val id: Int,
    @StringRes val titleResourceId: Int,
)*/