package Scanner;

import java.util.Scanner;

public class Floatuser {
	
	public static void main(String[]args) {
		float a;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Float number");
		
		a=sc.nextFloat();
		
		System.out.println(a+" Float value is ");
		sc.close();
	}

}
