package Static12;

import java.util.Scanner;

public class DemoStatic {

	static float rate=10;
	float p,d,si,tot;
	
 DemoStatic(float x,float y) {
	p=x;
	d=y;
	
}
void calculate() {
	
si =(p*rate*d)/100;
tot=si+p;
	
}
void display() {
	System.out.println("simple intrest");
	System.out.println("Total Amount Received= "+tot);
	System.out.println("simple intrest = "+si);
	
}

	
}
