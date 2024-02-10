package com.plcoding.graphqlcountriesapp.domain

import com.plcoding.CountriesQuery
import com.plcoding.CountryQuery

fun CountryQuery.Country.toDetailedCountry(): DetailedCountry {
    return DetailedCountry(
        name = name,
        capital = capital ?: "No Capital",
        currency = currency ?: "No Currency",
        languages = languages.mapNotNull { it.name },
        continent = continent.name,
        code = code,
        emoji = emoji
    )
}

fun CountriesQuery.Country.toSimpleCountry(): SimpleCountry {
    return SimpleCountry(
        name = name,
        capital = capital ?: "No Capital",
        code = code,
        emoji = emoji
    )
}