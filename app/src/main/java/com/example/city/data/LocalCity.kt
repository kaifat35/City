package com.example.city.data


import com.example.unscramble.R


object LocalMyCity {

    fun getCityParks(): List<Parks>{
        return listOf(
            Parks(
                id = 1,
                titleResourceId = R.string.Victory_Park,
                subtitleResourceId = R.string.Victory_Park_list_subtitle,
                imageResourceId = R.drawable.viktory_park,
                cityDetails = R.string.Victory_Park_list_subtitle
            ),
            Parks(
                id = 2,
                titleResourceId = R.string.Komsomolsky_Park,
                subtitleResourceId = R.string.Komsomolsky_Park_list_subtitle,
                imageResourceId = R.drawable.komsomolsky_park,
                cityDetails = R.string.Komsomolsky_Park_list_subtitle
            ),
            Parks(
                id = 3,
                titleResourceId = R.string.Salt_Garden,
                subtitleResourceId = R.string.Salt_Garden_list_subtitle,
                imageResourceId = R.drawable.salt_garden,
                cityDetails = R.string.Salt_Garden_list_subtitle
            ),
            Parks(
                id = 4,
                titleResourceId = R.string.Serpentine_Park,
                subtitleResourceId = R.string.Serpentine_Park_list_subtitle,
                imageResourceId = R.drawable.serpentine_park,
                cityDetails = R.string.Serpentine_Park_list_subtitle
            ),
        )
    }

    fun getCityBridges(): List<Bridges> {
        return listOf(
            Bridges(
                id = 1,
                titleResourceId = R.string.Arkhangelsk_bridge,
                subtitleResourceId = R.string.Arkhangelsk_bridge_list_subtitle,
                imageResourceId = R.drawable.arh_most_new,
                cityDetails = R.string.Arkhangelsk_bridge_list_subtitle
            ),
            Bridges(
                id = 2,
                titleResourceId = R.string.Oktyabrsky_Bridge,
                subtitleResourceId = R.string.Oktyabrsky_Bridge_list_subtitle,
                imageResourceId = R.drawable.okt_new,
                cityDetails = R.string.Oktyabrsky_Bridge_list_subtitle
            ),
            Bridges(
                id = 3,
                titleResourceId = R.string.Alexandrovskaya_embankment,
                subtitleResourceId = R.string.Alexandrovskaya_embankment_list_subtitle,
                imageResourceId = R.drawable.alexandrovskaya_embankment,
                cityDetails = R.string.Alexandrovskaya_embankment_list_subtitle
            ),
        )
    }

        fun getCityPalaces(): List<Palaces> {
            return listOf(
                Palaces(
                    id = 1,
                    titleResourceId = R.string.THE_PALACE_of_Chemists,
                    subtitleResourceId = R.string.THE_PALACE_of_Chemists_list_subtitle,
                    imageResourceId = R.drawable.the_palace_of_chemists,
                    cityDetails = R.string.THE_PALACE_of_Chemists_list_subtitle
                ),
                Palaces(
                    id = 2,
                    titleResourceId = R.string.THE_PALACE_OF_METALLURGISTS,
                    subtitleResourceId = R.string.THE_PALACE_OF_METALLURGISTS_list_subtitle,
                    imageResourceId = R.drawable.dkm,
                    cityDetails = R.string.THE_PALACE_OF_METALLURGISTS_list_subtitle
                ),
                Palaces(
                    id = 3,
                    titleResourceId = R.string.Chamber_theatre,
                    subtitleResourceId = R.string.Chamber_theatre_list_subtitle,
                    imageResourceId = R.drawable.kamerny_new,
                    cityDetails = R.string.Chamber_theatre_list_subtitle
                ),
            )
        }

    /*fun getCityContent(): List<Content> {
        return listOf(
            Content(
                id = 1,
                titleResourceId = R.string.PARKS,
            ),
            Content(
                id = 2,
                titleResourceId = R.string.BRIDGES,
            ),
            Content(
                id = 3,
                titleResourceId = R.string.PALACES,
            ),
        )
    }*/
}