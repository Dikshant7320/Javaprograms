package Scanner;

import java.util.Scanner;

public class Nestedsc {
	public static void main(String[]args) {
		  // Greater amount two
		   int a,b,c;
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter First value:");
		   
		   a=sc.nextInt();
		   System.out.println("enter secound value");

		   b=sc.nextInt();
		   
		   System.out.println("Enter third value");
		   c=sc.nextInt();
		   
		   if(a>b)
			{
				if(a>b)
				{
				System.out.println(a+"a is greater ");
				
				
			}
				
			   else
			{
			
				System.out.println("c is greater");
			}
			}
			else
			{
		   if (b>c)
		   {
			   System.out.println(b + " b is greater");
		   }
		      else
		      {
		    	  System.out.println(c+"  is greater");
		    	  sc.close();
		      }
			}
	}

}

