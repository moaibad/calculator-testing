package com.a1.calculator;
import java.util.Scanner;

public class InputHandler {
	Scanner scanner = new Scanner(System.in);
	
	public String[] getNumberInput() {
        String[] input = new String[2];
        
        System.out.print("Masukkan bilangan pertama: ");
        input[0] = scanner.nextLine();
        
        System.out.print("Masukkan bilangan kedua: ");
        input[1] = scanner.nextLine();
        
        return input;
    }
	
	public String getOperatorInput() {
        String input = new String();
                
        System.out.print("Masukkan Operator ([+] [-] [*] [/]): ");
        input = scanner.nextLine();
        
        return input;
    }
	
}
