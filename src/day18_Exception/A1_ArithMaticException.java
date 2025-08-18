package day18_Exception;

import java.util.Scanner;

public class A1_ArithMaticException {

	public static void main(String[] args) {

		System.out.println("The Programme has started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the Dividing Number : ");
		int num2 = sc.nextInt();

		 
		try {
			System.out.println(num1 / num2);
		}
		
		//Exception
		catch (ArithmeticException e) 
		{
			//Below Line will show the Exception Message occurred place
			// e.printStackTrace();
			
			System.out.println(e.getMessage());
			System.out.println("InValid Data");
		}
		
		System.out.println("The Programme has Ended");
	}

}
