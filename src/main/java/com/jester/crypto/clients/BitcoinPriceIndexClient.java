package com.jester.crypto.clients;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jester.crypto.models.CoinResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinPriceIndexClient {
@Autowired RestTemplate restTemplate;

    public String getExchange() throws JsonProcessingException {
        String response = restTemplate.getForObject("https://api.coindesk.com/v1/bpi/currentprice.json", String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        CoinResponse coinResponse = objectMapper.readValue(response, CoinResponse.class);
        return coinResponse.getBpi().getEUR().getRate();
    }
}
