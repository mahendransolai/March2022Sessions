package javasessions;

public class Customer {

	// function can not be created inside a function 
	//function should be independent to each other
	
	//1. no input and no return:
	// void: does not return anything (no return keyword)
	//return type = void 
	public void test() { //o parameter 
		System.out.println("Test method ....");
				
	}
	
	
	public void testing() {
		
	System.out.println("Testing method...");
	
	int a = 10 ;
	int b = 20;
	int c = 30;
	int sum = a + b + c;
	
		
	System.out.println( "Sum of 3 numbers: " + sum);
	}
	
	
	
	//2. no input but some return:
	//return type int 
	
	public int getMarks( ) {
		
		System.out.println("get marks...");
		
		int marks = 100;
		int bonus = 50;
		int totalMarks = marks + bonus ;
		
		return totalMarks;
	}
	
	
	public String getName() {
		System.out.println("get name ...");
		String name = "Tom";
		return name;
	}
	
	
	public char getChar() {
		
		System.out.println("Get char value ...");
		
		
		char c = 'a';
		return c;
	}
		
	//3. some input and some returns:
	//return type - int

		public int sum1(int a , int b) {
			
			System.out.println("sum of 2 numbers ");
			
			
			int z = a + b ;
			return z;	
		
	}
		
		
	public int getStudentMarks(String studentName ) {
		
		System.out.println("Student name :" + studentName);
		
		if(studentName.equals("Vani")) {
			return 90;
		}
		else if(studentName.equals("Fariba")) {
			return 100;
			
		}
		return 0;
		
		
	}
		
	
	public static void main(String[] args) {
			
		
		//call the functions : create the object of this class:
		
		Customer obj = new Customer();
		obj.test();
		obj.testing();
		obj.getMarks();		
		System.out.println(obj.getMarks());
		
		
		int m = obj.getMarks();
		System.out.println(m);
	
		String str= obj.getName();
		System.out.println("Welcome " + str );
		
		
		char c = obj.getChar();
				
		System.out.println("Chaacter value : "+ (int)c);	
		
		
	
		
		
	}

}
