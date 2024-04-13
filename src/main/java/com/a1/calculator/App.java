package com.a1.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	InputHandler inputHandler = new InputHandler();
    	InputValidator inputValidator = new InputValidator();
    	MathOperation mathOperation = new MathOperation();
    	
    	String[] input = inputHandler.getNumberInput();
    	
    	if(inputValidator.validateInputCount(input) && inputValidator.validateNumericInput(input)) {
    		System.out.println( "Hello World! Bener nih");
    	}
    	else {
    		System.out.println( "Hello World!");
    	}
    	
    }
}
