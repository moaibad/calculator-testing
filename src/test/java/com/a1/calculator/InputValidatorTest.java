package com.a1.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class InputValidatorTest {

    private InputValidator inputValidator;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        inputValidator = new InputValidator();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testValidateNumericInput() {
        String[] input;
        String expectedOutput = "Input harus berupa bilangan bulat dalam rentang -2,147,483,648 hingga +2,147,483,647.";

        // Test dua input numerik valid (di dalam rentang MIN_VALUE hingga MAX_VALUE tipe data integer)
        input = new String[]{"12500", "4000"};
        Assert.assertTrue(inputValidator.validateNumericInput(input));

        // Test dua input numerik invalid (di luar rentang MIN_VALUE tipe data integer)
        input = new String[]{"-2147483649", "214"};
        Assert.assertFalse(inputValidator.validateNumericInput(input));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

        // Test dua input numerik invalid (di luar rentang MIN_VALUE tipe data integer)
        input = new String[]{"2147483648", "412"};
        Assert.assertFalse(inputValidator.validateNumericInput(input));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

        // Test dua input String
        input = new String[]{"manto", "nih"};
        Assert.assertFalse(inputValidator.validateNumericInput(input));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

        // Test satu input integer dan satu input String
        input = new String[]{"manto", "412"};
        Assert.assertFalse(inputValidator.validateNumericInput(input));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));
    }

    @Test
    public void testValidateInputCount(){
        String[] input;
        String expectedOutput = "Input harus terdapat operand dan tidak boleh kosong.";

        // Test input valid
        input = new String[]{"412", "21"};
        Assert.assertTrue(inputValidator.validateInputCount(input));

        // Test input invalid
        input = new String[]{"1212", ""};
        Assert.assertFalse(inputValidator.validateInputCount(input));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));
    }

    @Test
    public void testValidateMathOperator(){
        String input;
        String expectedOutput = "Operasi tidak valid. Gunakan +, -, *, atau /.";

        // Test input valid (+)
        input = "+";
        Assert.assertTrue(inputValidator.validateMathOperator(input));

        // Test input valid (-)
        input = "-";
        Assert.assertTrue(inputValidator.validateMathOperator(input));

        // Test input valid (*)
        input = "*";
        Assert.assertTrue(inputValidator.validateMathOperator(input));

        // Test input valid (/)
        input = "/";
        Assert.assertTrue(inputValidator.validateMathOperator(input));

        // Test input invalid
        input = "=";
        Assert.assertFalse(inputValidator.validateMathOperator(input));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));

        // Test input String kosong
        input = "";
        Assert.assertFalse(inputValidator.validateMathOperator(input));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));
    }

    @Test
    public void testValidateDivisionByZero(){
        int number;
        String operator = "/";
        String expectedOutput = "Pembagian oleh nol tidak diizinkan.";

        // Test input valid
        number = 4;
        Assert.assertTrue(inputValidator.validateDivisionByZero(operator, number));

        // Test input invalid
        number = 0;
        Assert.assertFalse(inputValidator.validateDivisionByZero(operator, number));
        Assert.assertTrue(outputStream.toString().contains(expectedOutput));
    }

}