package com.example.controller;

import com.example.domain.model.ExchangeRate;
import com.example.domain.service.IExchangeMoney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchangeMoney")
public class ExchangeController {

    @Autowired
    private IExchangeMoney exchangeMoney;

    @PostMapping("/totalFee")
    public Double totalFee(@RequestBody ExchangeRate rate) {
        return exchangeMoney.calculateTotalFee(rate);
    }
}
