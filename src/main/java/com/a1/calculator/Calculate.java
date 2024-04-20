package com.a1.calculator;

public class Calculate {
	
	public void calculateResult(int a, int b, String operator) {
		MathOperation mathOperation = new MathOperation();
		
		switch (operator) {
	        case "+":
	        	System.out.println("Hasil: " + mathOperation.add(a, b));
	        	break;
	        case "-":
	        	System.out.println("Hasil: " + mathOperation.subtract(a, b));
	        	break;
	        case "*":
	        	System.out.println("Hasil: " + mathOperation.multiply(a, b));
	        	break;
	        case "/":
	        	System.out.println("Hasil: " + mathOperation.divide(a, b));
	        	break;
		}
	}
}

//meriksa operator dan bilangan 
