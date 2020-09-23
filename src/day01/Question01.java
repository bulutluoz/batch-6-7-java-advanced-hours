package day01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to compute body mass index (BMI) print the situation. 
		 * Is user weak, fat or obese ?
		 * 
		 * (Hint BMI = weight(kg)/ (height*height)(m) 
		 * 
		 * BMI<20 weak 
		 * 20<BMI<25 healthy
		 * 25<BMI<30 fat 
		 * Over 30 obese
		 */
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your weight in kg");
        double w = scan.nextDouble();
        
        System.out.println("Enter your height in meter");
        
        double h = scan.nextDouble();
        
        double bmi = w / (h*h);

		System.out.println(bmi);
		
		if(bmi<20) {
            System.out.println("your bmi = " +bmi + " you are weak");
        } else if (bmi>20 && bmi<=25) {
            System.out.println("healthy");
        }else if (bmi>25 && bmi<=30) {
            System.out.println("fat");
        }else {
            System.out.println("obese");
        }

		

	}

}
