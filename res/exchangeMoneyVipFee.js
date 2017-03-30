function fee(amount, currency, feeType) {
    if(feeType == "VIP_FEE"){
        amount *= 1.5;
    }
    return amount;
}


