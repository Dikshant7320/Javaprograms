package Scanner;

import java.util.Scanner;

public class ElseifLadder {
	public static void main(String[]args) {
		
		float Eng,Mat,Sci,Sst,Hi,Total,Per;
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Marks Obtained in English:");
		Eng=sc.nextFloat();
		
		System.out.println("Marks obtained in Maths:");
		Mat=sc.nextFloat();
		
		System.out.println("Marks obtained in Science:");
		Sci=sc.nextFloat();
		
		System.out.println("Marks obtained in Social Science:");
		Sst=sc.nextFloat();
		
		System.out.println("Marks obtained in hindi:");
		Hi=sc.nextFloat();
		
		Total=Eng+Mat+Sci+Sst+Hi;
		Per=Total/5;
		System.out.println("Total Marks Obtained:"+Total);
		System.out.println("Percentage Obtained:"+Per);
		
		if(Per>=75)
		{
			System.out.println("Result:Distinction");
		}
		
		else if(Per>=60)
		{
			System.out.println("Result:First Class");
		}
		
		else if(Per>=50)
		{
			System.out.println("Result:Secound Class");
		}
		
		else if(Per>=40) {
			System.out.println("Result:Third Class");
		}
		
		else if(Per>=35)
		{
			System.out.println("Result:Pass");
		}
		
		else {
			System.out.println("Result:Fail");
	}
		
	
		
	
	}
}
