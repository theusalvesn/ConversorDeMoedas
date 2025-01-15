package br.com.conversordemoedas.service;
import br.com.conversordemoedas.api.CurrencyAPI;
import br.com.conversordemoedas.models.CurrencyRate;

import java.util.Map;


public class ConversionService {

    private final CurrencyAPI currencyAPI;

    public ConversionService(CurrencyAPI currencyAPI) {
        this.currencyAPI = currencyAPI;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        CurrencyRate currencyRate = currencyAPI.getCurrencyRate();
        Map<String, Double> rates = currencyRate.conversion_rates();

        double fromRate = rates.get(fromCurrency);
        double toRate = rates.get(toCurrency);

        return (amount / fromRate) * toRate;

    }
}


