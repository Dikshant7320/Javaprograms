package Wrapper;

public class Enum {  //java enmus and enum is special class that represnt a group of constants(Unchangble like final variable
	                  //to create an enum use the 'enum' keyword seprate the constants with a comma, and note that they should be in upper case. 
                      // enum Level{LOW,MID,HIGH}
	
	
public enum students{DIKSHANT, SHRIDHAR ,BANAGE}

	public static void main(String[] args) {
		
		for(students s:students.values())
			
			System.out.println(s);

	}

}
