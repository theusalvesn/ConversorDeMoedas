package br.com.conversordemoedas.models;
import java.util.Map;

public record CurrencyRate (String base_code, Map<String, Double> conversion_rates) {}
