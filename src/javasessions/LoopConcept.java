package javasessions;

public class LoopConcept {

	public static void main(String[] args) {
		
		
		
//		System.out.println("For loop concept");
		
//		for(;;) {
//			
//			System.out.println("Infinte loop");
//		}
				
		
		System.out.println("First 10 int numbers");
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			
		}
		
	
		System.out.println("**************");
		
		
		System.out.println("First 10 byte numbers");
		for(byte j1=1;j1<=10;j1++) {
			System.out.println(j1);
			
		}
				
		
		System.out.println("First 10 double numbers");
		for(double j21=1.0;j21<=10.0;j21++) {
			System.out.println(j21);
			
		}
				
		System.out.println("Small letters");		
		for(char c = 'a';c <='z';c++) {
			System.out.println(c);	
		}
		
		System.out.println("Captial letters");
		for(char c1= 'A';c1 <='Z';c1++) {
			System.out.println(c1);
			
		}
		
		System.out.println("ASCII vlaues");
		for(char c2 ='a';c2 <='z';c2++) {
			System.out.println("Vlaue of  "+ c2 + " : "+ (int) (c2));
		}
		
		System.out.println("**************");
		
		System.out.println("while loop concept");
		int i=1;
		while(i<11) {
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("***** ABC using while loop *********");		
		char d= 'a';
		while(d<='z') {
			System.out.println(d);
			d++;
		}
		
		
		System.out.println("Do while concept ");
		int p=1;
		do {
			System.out.println(p);
			p++;
		}while (p<=10);
		
		
	}

}
