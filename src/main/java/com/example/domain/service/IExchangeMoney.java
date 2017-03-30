package com.example.domain.service;

import com.example.domain.model.ExchangeRate;

public interface IExchangeMoney {
    Double calculateTotalFee(ExchangeRate rate);
}
