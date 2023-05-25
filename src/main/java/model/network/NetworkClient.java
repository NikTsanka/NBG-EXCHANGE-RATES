package model.network;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.data.CurrencyData;

import java.io.IOException;
import java.util.List;

public class NetworkClient {
    private final String URL_EN = "https://nbg.gov.ge/gw/api/ct/monetarypolicy/currencies/en/json";

    public void startApp() {
        getRates();
    }

    private void getRates() {
        try {
            NBGService nbgCurrencies = new NBGService();
            String jsonData = nbgCurrencies.getJsonDataFromUrl(URL_EN);

            ObjectMapper om = new ObjectMapper();
            CurrencyData[] currencyDataArray = om.readValue(jsonData, CurrencyData[].class);
            for (CurrencyData currencyData : currencyDataArray) {
                System.out.println("Date: " + currencyData.getDate());
                List<CurrencyData.Currency> currencies = currencyData.getCurrencies();
                for (CurrencyData.Currency currency : currencies) {
                    System.out.println(currency.toString());
                }
            }
        } catch (
                IOException e) {
            System.out.println("Error occurred while fetching JSON data: " + e.getMessage());
        }
    }
}
