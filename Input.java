package Javapro;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Your Age:");
	int age=sc.nextInt();
	System.out.println(age);
	
	float age1=sc.nextFloat();
	System.out.println(age1);
	
	//String
	
	String name=sc.next();
	System.out.println("My Name Is :"+name);
	
	//run sentence
	String name1=sc.nextLine();
	System.out.println(name1);
	
	
	
	
	
	
	}

}
