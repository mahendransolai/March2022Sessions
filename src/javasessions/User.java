package javasessions;

public class User {
	
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Kapil";
		u1.age	= 79;
		u1.city = "Haryana";
		
		
		User u2 = new User();
		u2.name = "Srikanth";
		u2.age	= 63;
		u2.city = "TamilNadu";
		
		User u3 = new User();
		u3.name = "Kumble";
		u3.age	= 45;
		u3.city = "Karnataka";
		

		
		System.out.println(u1.name +"     "+u1.age +"    " + u1.city);
		System.out.println(u2.name +"     "+u2.age +"    " + u2.city);
		System.out.println(u3.name +"     "+u3.age +"    " + u3.city);
		
		
		u3= u1;
		System.out.println(u1.name +"     "+u1.age +"    " + u1.city);
		System.out.println(u2.name +"     "+u2.age +"    " + u2.city);
		System.out.println(u3.name +"     "+u3.age +"    " + u3.city);
		
		u1=u2;
		System.out.println(u1.name +"     "+u1.age +"    " + u1.city);
		System.out.println(u2.name +"     "+u2.age +"    " + u2.city);
		System.out.println(u3.name +"     "+u3.age +"    " + u3.city);
		
	}

}
