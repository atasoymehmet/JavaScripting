package com.example.domain;

public class DiscountService {

    public static double calculateDiscountFromFee(Double amount) {
        if (amount > 100) {
            return amount *= 0.8;
        }
        return amount *= 0.95;
    }
}
