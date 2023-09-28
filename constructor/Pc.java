package constructor;

public class Pc {
	
		int n1,n2,add;

		Pc(int x,int y)
		{
			System.out.println("This is Paramterized constructor");
			
			n1=x;
			n2=y;
		}

		void cal()
		{
			add=n1+n2;
			
			System.out.println("Summation is "+add);
			
		}



}
