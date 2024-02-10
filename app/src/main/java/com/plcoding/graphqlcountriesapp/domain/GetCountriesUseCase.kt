package com.plcoding.graphqlcountriesapp.domain

class GetCountriesUseCase(val countryClient: CountryClient) {

    suspend operator fun invoke(): List<SimpleCountry> {
        return countryClient
            .getCountries()
            .sortedBy { it.name }

    }

}