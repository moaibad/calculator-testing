package com.a1.calculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalculateTest extends TestCase {
    
    private Calculate calculate;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        calculate = new Calculate();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCalculateResult(){
        String expectedOutput;
                // Test penjumlahan dua bilangan positif
        expectedOutput = "Hasil: 27";
        calculate.calculateResult(15, 12, "+");
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

        // Test pengurangan dua bilangan positif
        expectedOutput = "Hasil: -8";
        calculate.calculateResult(4, 12, "-");
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

        // Test perkalian dua bilangan positif
        expectedOutput = "Hasil: 2700";
        calculate.calculateResult(900, 3, "*");
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

        // Test pembagian dua bilangan positif
        expectedOutput = "Hasil: 38.9";
        calculate.calculateResult(1945, 50, "/");
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

    }

}