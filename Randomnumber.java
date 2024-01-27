package Javapro;

import java.util.Scanner;

public class Randomnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mynumber=((int)Math.random()*100);
		int usernumber=0;
	
		do {
			System.out.println("Guess my number");
			usernumber=sc.nextInt();
		if(usernumber==mynumber) 
		{
			System.out.println("wowowowowo");
		}
		else if (usernumber>mynumber)
		{
			System.out.println("your number is to large ");
		}
		else
		{
			System.out.println("small number");
		}
		}while(usernumber>=0);
		System.out.println("my number");
		System.out.println(mynumber);
		
	}
}


