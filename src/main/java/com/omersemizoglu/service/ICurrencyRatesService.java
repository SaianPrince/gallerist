package com.omersemizoglu.service;

import com.omersemizoglu.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService {

	public CurrencyRatesResponse getCurrencyRates(String startDate , String endDate);
}
