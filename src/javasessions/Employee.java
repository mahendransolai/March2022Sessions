package javasessions;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isPermanent;
	
	
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		e1.name = "Mahen";
		e1.salary = 12.33;
		e1.age = 42;
		e1.isPermanent = true;
		
		
		System.out.println((e1.name + " " + e1.age +"  " + e1.salary));
					
		
		
		Employee e2 = new Employee();
		System.out.println((e2.name + " " + e2.age +"  " + e2.salary)); //default Value 
		

		Employee e3 = new Employee();
		e3.name = "Pete";
		System.out.println("e3.name"+"  " +e3.age + "   "+e3.isPermanent);
		
		
		//no reference object
		
		new Employee();
		
		new Employee().name = "No name ";
		
		new Employee().age = 25;
		
		
		//null ref type object :
		
		Employee e4 = new Employee();
		e4 = null;
		e4.name = "Classic ";
		
		System.out.println(e4.name);
	}

}
