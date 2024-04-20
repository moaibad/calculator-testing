package com.a1.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class InputHandlerTest {
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;
    private InputHandler inputHandler;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Before
    public void setUp() {
        inputHandler = new InputHandler();
    }

    @Test
    public void testGetNumberInput() {
        provideInput("5\n10\n");
        String[] result = inputHandler.getNumberInput();
        assertEquals("5", result[0]);
        assertEquals("10", result[1]);
    }

    @Test
    public void testGetOperatorInput() {
        provideInput("+\n");
        String result = inputHandler.getOperatorInput();
        assertEquals("+", result);
    }
}
