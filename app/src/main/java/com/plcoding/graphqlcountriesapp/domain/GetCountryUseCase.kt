package com.plcoding.graphqlcountriesapp.domain

class GetCountryUseCase(val countryClient: CountryClient) {

    suspend operator fun invoke(code: String): DetailedCountry? {
        return countryClient.getCountry(code)
    }

}