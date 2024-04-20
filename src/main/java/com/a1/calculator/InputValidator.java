package com.a1.calculator;

public class InputValidator {
	
	public boolean validateNumericInput(String[] input) {
        try {
            for (String str : input) {
                int num = Integer.parseInt(str);
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa bilangan bulat dalam rentang -2,147,483,648 hingga +2,147,483,647.");
            return false;
        }
	}
	
	public boolean validateInputCount(String[] input) {
		for (String str : input) {
	        if (str.trim().isEmpty()) {
	            System.out.println("Input harus terdapat operand dan tidak boleh kosong.");
	            return false;
	        }
	    }
	    return true;
    }

	public boolean validateMathOperator(String operator) {
        if (!operator.matches("[+\\-*/]")) {
            System.out.println("Operasi tidak valid. Gunakan +, -, *, atau /.");
            return false;
        }
        return true;
    }
	
	public boolean validateDivisionByZero(String operator, int number) {
        if (operator.equals("/") && number == 0) {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
            return false;
        }
        return true;
    }

}
