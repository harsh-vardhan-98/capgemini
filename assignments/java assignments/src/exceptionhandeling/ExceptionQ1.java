package exceptionhandeling;

import java.util.Scanner;

public class ExceptionQ1 {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	int num1 = input.nextInt();
    	int num2 = input.nextInt();
	
    	try {
    		int num3 = num1/num2;
    		System.out.println(num3);
    	}catch(ArithmeticException e) {
    		System.out.println("UnsupportedOperationException");
    		
		}

}
}
