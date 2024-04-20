package com.a1.calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest extends TestCase {
    
    private Calculate calculate;
    
    @Before
    public void setUp() {
        calculate = new Calculate();
    }

    @Test
    public void testCalculateResult(){
        // Test penjumlahan dua bilangan positif
        calculate.calculateResult(15, 12, "+");
        Assert.assertEquals("Hasil: 27", "Hasil: 27");

        // Test pengurangan dua bilangan positif
        calculate.calculateResult(4, 12, "-");
        Assert.assertEquals("Hasil: -8", "Hasil: -8");

        // Test perkalian dua bilangan positif
        calculate.calculateResult(900, 3, "*");
        Assert.assertEquals("Hasil: 2700", "Hasil: 2700");

        // Test pembagian dua bilangan positif
        calculate.calculateResult(1945, 50, "/");
        Assert.assertEquals("Hasil: 38.9", "Hasil: 38.9");

}

}
