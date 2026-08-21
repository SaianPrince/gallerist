package com.omersemizoglu.controller;

import com.omersemizoglu.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {

	public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate , String endDate);
}
