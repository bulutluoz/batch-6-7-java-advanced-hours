package day01;

import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Generate a Random integer between 0-100. 
		 * ask user to find integer. 
		 * For every guess print to console “My number is smaller than your number ”(or greater )
		 * and finally if user find the number 
		 * print how many guess did user enter.
		 * 
		 */
		
		Random rnd = new Random();
		int myNumber= rnd.nextInt(100);
		
		
		int count =1;
		int guess =0;
		
		do {Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an integer ");
			guess=scan.nextInt();
			
			if (myNumber>guess) {
				System.out.println("My number is greater then yours");
				count++;
				
			} else if (myNumber<guess) {
				System.out.println("My number is smaller then yours");
				count++;
			} else {System.out.println("You found my number at " + count + ". guess" );
					;	}
			
			
			
			
		}while(myNumber != guess);
		
		
		
		
		

	}

}
