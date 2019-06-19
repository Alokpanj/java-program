package lesson1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		

        // int
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int user_input = scan.nextInt();
		
		System.out.println("Entered value is");
		System.out.println(user_input);
		
		// double
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Double Number");
		double user_input_double = scan1.nextDouble();
		
		System.out.println("Entered double value is");
		System.out.println(user_input_double);
		

		
		// String 
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter String Value");
		String str = scan2.nextLine();
		
		System.out.println("Entered string value is");
		System.out.println(str);
	
		// boolean
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter boolean Value");
		boolean  num = scan3.hasNextBoolean();
		
		System.out.println("Entered boolean value is");
		System.out.println(num);
		
	}

}
