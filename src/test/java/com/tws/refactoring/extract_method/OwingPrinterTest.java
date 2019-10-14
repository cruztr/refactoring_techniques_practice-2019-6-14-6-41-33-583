package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        List<Double> orderList = new ArrayList<>();
        orderList.add(25.5);
        orderList.add(69.9);

        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printOwing("Dan", orderList);

        String expectedOutput =
                "*****************************\n" +
                "****** Customer totals ******\n" +
                "*****************************\n" +
                "name: Dan\n" +
                "amount: 95.4\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}