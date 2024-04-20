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
    	Calculate calculate = new Calculate();
    	
    	String[] input = inputHandler.getNumberInput();
    	
    	if(inputValidator.validateInputCount(input) && inputValidator.validateNumericInput(input)) {
    		int a = Integer.parseInt(input[0]);
    		int b = Integer.parseInt(input[1]);
    		String operator = inputHandler.getOperatorInput();
    		
    		if (inputValidator.validateMathOperator(operator)) {
    			
    			if (inputValidator.validateDivisionByZero(operator, b)) {
    				calculate.calculateResult(a, b, operator);
    			}
    			
    		}
    }
	System.out.println( "Aplikasi kalkulator selesai." );
	}
}
