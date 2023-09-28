package Scanner;

import java.util.Scanner;


public class Stringmethod {        // String Method To get input user
	
	public static void main(String[] args) {
		
         String Name;
         
         Scanner sc =new Scanner(System.in);
         
         System.out.println("Enter your Name:");
	
         Name= sc.next();
         
	    	System.out.println("Hello Dikshant:"+Name);
	    	sc.close();
	}

}

