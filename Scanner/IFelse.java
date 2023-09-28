package Scanner;

import java.util.Scanner;

public class IFelse {
	public static void main(String[]args) {
		  // Greater amount two
		   int a,b;
		   Scanner sc =new Scanner(System.in);
		   System.out.println("Enter First Number:");
		   
		   a=sc.nextInt();
		   System.out.println("enter secound value");

		   b=sc.nextInt();
		   
		   if(a>b) {
			   
			   System.out.println(a+" is Greater");
			
		   }
		   else {
			   
			   System.out.println(b+" is greater");
			   sc.close();
		   }

}
}
