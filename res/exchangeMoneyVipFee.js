function fee(amount, currency, feeType) {
    if(feeType == "VIP_FEE"){
        amount *= 1.5;
    }
    return discountFromFee(amount);
}

function discountFromFee(amount) {
    var myClass = Java.type('com.example.domain.DiscountService');
    return myClass.calculateDiscountFromFee(amount);
}

