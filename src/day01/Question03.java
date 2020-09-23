package day01;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM
		 * (Least Common Multiple) (if user enter 30 and 40, GCD = 10 and LCM = 120)
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 numbers ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int gcd = num1;
		int lcm = num1;

		// gcd
		
		for (int i = num1; i >1; i--) {
			
			if (num1%i==0 && num2%i==0) {
				System.out.println("GCD for " + num1 + " and " + num2 + " = " + i);
				break;
			} 
			
		}
		
		//lcm
		
		for (int i = num1; i <num1*num2 ; i++) {
			
			if (i%num1==0 && i%num2==0) {
				System.out.println("LCM for " + num1 + " and " + num2 + " = " + i);
				break;
			} 
			
		}
		
		

	}

}
