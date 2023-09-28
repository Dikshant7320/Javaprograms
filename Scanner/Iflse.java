package Scanner;

import java.util.Scanner;

public class Iflse {
	
	public static void main(String[]args) {
	int p;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Password");

	p=sc.nextInt();
	//System.out.println("Welcome");
	
     if(p==2004) {
	
		System.out.println("Your entered password is correct");
		sc.close();
			
	
     }
     else {
    	 
    	 System.out.println("Your Entered Password is wrong");
     }
    	 
	}
}
