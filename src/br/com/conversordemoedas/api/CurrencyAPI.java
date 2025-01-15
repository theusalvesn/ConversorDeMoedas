package br.com.conversordemoedas.api;

import br.com.conversordemoedas.models.CurrencyRate;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyAPI {
    private final URI urlStr = URI.create("https://v6.exchangerate-api.com/v6/c9950f363f5de8dca554979a/latest/BRL");
    HttpClient client = HttpClient.newHttpClient();

    public CurrencyRate getCurrencyRate() {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(urlStr)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), CurrencyRate.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error",e);
        }
    }
}
