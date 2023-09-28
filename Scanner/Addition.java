 package Scanner;

import java.util.Scanner;

public class Addition {
   public static void main(String[]args) {
	   
	   int a,b,add,mul,div,mod,sub;
	   
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter First value:");
	   
	   a=sc.nextInt();
	   System.out.println("enter secound value");

	   b=sc.nextInt();
	   add=a+b;
	   System.out.println("Addition: "+add);
	   
	   sub=a-b;
	   div=a/b;
	   mul=a*b;
	   mod=a%b;  
	   System.out.println("addition=" +sub);
	   System.out.println("Division=" +div);
	   System.out.println("Multiplication=" +mul);
	   System.out.println("Reminder=" +mod);
	   sc.close();

   }

  
}
