package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private int quantity;
    private int itemPrice;

    public PriceCalculator(int quantity, int itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice() {
        return getTotalPrice();
    }

    private double getTotalPrice() {
        return getBasePrice() -
                getDiscount() +
                getShippingCost();
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }

    private double getDiscount() {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double getShippingCost() {
        return Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
