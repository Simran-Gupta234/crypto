package com.jester.crypto.restservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jester.crypto.clients.BitcoinPriceIndexClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitcoinPriceIndexController {
    @Autowired BitcoinPriceIndexClient bitcoinPriceIndexClient;

    @GetMapping("/price")
    public String bitcoinPriceIndex() throws JsonProcessingException {
        return bitcoinPriceIndexClient.getExchange();
    }
}
