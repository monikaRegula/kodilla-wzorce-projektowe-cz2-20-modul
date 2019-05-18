package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;
//podstawowa klasa wzorca Decorator nazywana DELEGATEM.
public class BasicTaxiOrder implements TaxiOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.00);
    }

    @Override
    public String getDescription() {
        return "Drive a course";
    }
}
