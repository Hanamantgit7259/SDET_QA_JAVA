package day18_Exception;

import java.util.Scanner;

public class A2_Try_catch_Finally {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data");

		String data;

		try {
			  data = sc.nextLine();
			  
			  int num=Integer.parseInt(data);
			//System.out.println(data.length());
		} 
		catch (Exception e) {
			System.out.println("The Exception is Handled");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Block executed ");
		}

	}

}
