package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertableCurrency {

    CurrencyType type = CurrencyType.POUND;

    public CurrencyType getType(){
        return type;
    }
}
