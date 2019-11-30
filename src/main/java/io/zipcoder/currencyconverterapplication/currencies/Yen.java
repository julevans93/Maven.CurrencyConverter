package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
import org.omg.CORBA.Current;

public class Yen implements ConvertableCurrency {

    CurrencyType type = CurrencyType.YEN;

    public CurrencyType getType(){
        return type;
    }
}
