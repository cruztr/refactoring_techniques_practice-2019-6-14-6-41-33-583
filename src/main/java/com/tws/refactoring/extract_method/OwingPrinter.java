package com.tws.refactoring.extract_method;

import java.util.List;

public class OwingPrinter {
    void printOwing(String name, List<Double> orderList) {
        String banner = generateBanner(name, getTotalAmount(orderList));
        System.out.print(banner);
    }

    private Double getTotalAmount(List<Double> orderList) {
        return orderList.stream()
                .reduce(Double::sum)
                .orElse(0.0);
    }

    private String generateBanner(String name, Double amount) {
        String banner =
                "*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: " + name + "\n" +
                "amount: " + amount + "\n";

        return banner;
    }
}
