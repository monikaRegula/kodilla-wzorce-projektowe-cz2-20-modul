package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaianOrder extends AbstractPizzaOrderDecorator {
    public HawaianOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", ananas, szynka";
    }
}
