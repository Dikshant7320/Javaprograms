package Scanner;

import java.util.Scanner;

public class Voting {
       
	public static void main(String[]args) {
		
		int age;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your age:");
		
		age=sc.nextInt();
		
		if(age>18) {
			
			System.out.println( " You are Eligible for Voting");
	
		}
		else
			System.out.println("You are not Eligible for Voting");

		 sc.close();
	}
	
	
}
