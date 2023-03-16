package javasessions;

public class Family {
	
	
	public void test() {
		System.out.println("test method");
	}
	
	public void testing() {
		System.out.println("Testing method");
		
		int a = 10 ;
		int b = 20 ;
		int c = 30 ;
		int sum = a+ b + c ;
		System.out.println(sum);
	}

	public int getmarks() {
		System.out.println("get marks");
		int marks = 100;
		int bonus = 50;
		int totalMarks = marks + bonus ;
		return totalMarks;
	}
	
	public String getName() {
		System.out.println("get name...");
		String name = "Tom";
		return name;
	}
	
	public char getChar() {
		System.out.println("Get char Value .class..");
		char c = 'a';
		return c;
		
	}
	
	// 2 parameters
	public int sum(int a , int b) {
		System.out.println("sum method");
		int z = a + b;
		return z;
		
	}
	
	//WAF : name -- > getStudentMarks
	//input parameter: student name (String)
	//Return : marks of the student --- > int
	
	
	public int getStudentMarks(String studentName) {
		System.out.println("Student name: " + studentName);
		int marks = -1;
		
		if (studentName.equals("Mani")) {
//			return 90;
			marks = 90;			
		}
		else if (studentName.equals("Raj")) {
			marks = 98;
		}
		else if (studentName.equals("King")) {
			marks = 100;
		}
		else {
			System.out.println("Please send right student name ...." + studentName);
			
		}
		return marks;
	}
	
	
	
	public static void main(String[] args) {
		
		Family obj = new Family();
		obj.test();
		obj.testing();
		
		
		obj.getmarks(); //return will not give answer directly 
		
		System.out.println(obj.getmarks());
		
		
//		Best way to get return
		int m = obj.getmarks();		
		System.out.println(m);
		
		
		String nm = obj.getName();
		System.out.println(nm);
		
			
		
		char c = obj.getChar();
		System.out.println((int)c);
		
		
		int sum = obj.sum(10, 40); //2 arguments  = it is the value of parameter
		System.out.println(sum);
		
		int stmark = obj.getStudentMarks("Mani");
		System.out.println(stmark);
		
	}

}
