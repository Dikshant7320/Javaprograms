package Scanner;

import java.util.Scanner;

public class Evenser {
	public static void main(String[]args) {
		
		int a;
          
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number:");
		
		a=sc.nextInt();
		
		if(a %2 ==0)
	{
			
		 System.out.println(a+" Number is even");
	}	
		else
			System.out.println(a+" number is odd");
		sc.close();
			}
         }



