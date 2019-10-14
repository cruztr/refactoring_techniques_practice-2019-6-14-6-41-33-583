package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void should_return_correct_price() {
        PriceCalculator priceCalculator = new PriceCalculator(2, 24);
        double price = priceCalculator.getPrice();

        assertEquals(52.8, price, 0.0);
    }
}