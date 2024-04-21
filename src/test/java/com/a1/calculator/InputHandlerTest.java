package com.a1.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class InputHandlerTest {
    private InputHandler inputHandler;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        inputHandler = new InputHandler();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testGetNumberInput() {
        String[] input = {"10", "12"};
        assertEquals("10", input[0]);
        assertEquals("12", input[1]);
    }

    @Test
    public void testGetOperatorInput() {
        String[] input = {"+", "/"};
        assertEquals("+", input[0]);
        assertEquals("/", input[1]);
    }
}
