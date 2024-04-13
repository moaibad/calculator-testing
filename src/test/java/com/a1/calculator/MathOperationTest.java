package com.a1.calculator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathOperationTest extends TestCase {

    private MathOperation mathOperation;
    private int result;

    @Before
    public void setUp() {
        mathOperation = new MathOperation();
    }

    @Test
    public void testMathOperationAdd(){
        // Test penjumlahan dua bilangan positif
        result = mathOperation.add(15,12);
        Assert.assertEquals(27, result);

        // Test penjumlahan dua bilangan negatif
        result = mathOperation.add(-10,-4);
        Assert.assertEquals(-14, result);

        // Test penjumlahan satu bilangan positif dan satu bilangan negatif
        result = mathOperation.add(15,-7);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testMathOperationSubtract(){
        // Test pengurangan dua bilangan positif
        result = mathOperation.subtract(8,3);
        Assert.assertEquals(5, result);

        // Test pengurangan dua bilangan negatif
        result = mathOperation.subtract(-40,-8);
        Assert.assertEquals(-32, result);

        // Test pengurangan satu bilangan positif dan satu bilangan negatif
        result = mathOperation.subtract(12,-7);
        Assert.assertEquals(19, result);
    }

    @Test
    public void testMathOperationMultiply(){
        // Test perkalian dua bilangan positif
        result = mathOperation.multiply(12, 8);
        Assert.assertEquals(96, result);

        // Test perkalian dua bilangan negatif
        result = mathOperation.multiply(-50, -25);
        Assert.assertEquals(1250, result);

        // Test perkalian satu bilangan positif dan satu bilangan negatif
        result = mathOperation.multiply(5, -7);
        Assert.assertEquals(-35, result);
    }

    @Test
    public void testMathOperationDivide() {
        double result;
        double delta = 0.001; // Toleransi untuk perbedaan floating-point

        // Test pembagian dua bilangan positif
        result = mathOperation.divide(15, 6);
        Assert.assertEquals(2.5, result, delta);

        // Test pembagian dua bilangan negatif
        result = mathOperation.divide(-20, -4);
        Assert.assertEquals(5, result, delta);

        // Test pembagian satu bilangan positif dan satu bilangan negatif
        result = mathOperation.divide(15, -10);
        Assert.assertEquals(-1.5, result, delta);
    }

}