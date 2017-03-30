package com.example.domain.model;

import com.example.domain.util.FeeTypes;
import lombok.Data;

import static com.example.domain.constants.CurrenciesConstants.EUR;
import static com.example.domain.util.FeeTypes.STANDART_FEE;

@Data
public class ExchangeRate {

    private double rate;
    private FeeTypes type = STANDART_FEE;
    private double feeAmount = 10.0;
    private String feeCurrency = EUR;

}
