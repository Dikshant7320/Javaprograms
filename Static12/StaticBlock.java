package Static12;

public class StaticBlock {  //Static variable can be intilized using the static block. the static get executed even before main method.  A class can have more then one static block //
	
	static int rno;
	static String name;
	static String username;
	static int userid;
	
static {
	
	rno=2;
	name="Dikshant";
	
	
}

static {
	
	username="Dikshya Ramos";
	userid=1234;
	
	
}

	public static void main(String[] args) {
		
		System.out.println("Rollno :"+rno);
		
		System.out.println("Name :"+name);
		
		System.out.println("UserName :"+username);
		
		System.out.println("id :"+userid);
	}

}
