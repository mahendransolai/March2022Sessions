package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size()); //0 -> Physcial capacity - 0 ;
		System.out.println(ar);
		ar.add(100); //0
		ar.add(200); //1
		
		System.out.println(ar.size());
		
		ar.add(300); //2
		ar.add(400); //3
		
		System.out.println(ar.size());
		
		
		
		System.out.println("li= " + 0);
		System.out.println(("size: " + ar.size()));
		System.out.println(("hi:") + 3);
		
		
		
		System.out.println(ar); // gives array value 
		System.out.println(ar.get(0));
		
		System.out.println(ar.get(3));
		
		//System.out.println(ar.get(4)); // - IOB Index out of Bound Exception
		
		// Physcial size 10 ; filled then virtual segment - 5
		
		//ar.add(5, 600);
		
		//System.out.println(ar.get(5)); // cannt add like this
		
		System.out.println("for Loop for content ");
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		  //generics in arraylist
		 
		ArrayList<String> stNames = new ArrayList<String>();
		
		stNames.add("Tom");
		stNames.add("Jerry");
		stNames.add("Mahen");
		
		
		System.out.println(stNames.size());
		
		for(String e : stNames) {
			System.out.println(e);
				if(e.equals("Mahen")) {
					System.out.println("Hey Mahen....");
					break;
				}
		}
		
		System.out.println(stNames);
		
		
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(75);
		marksList.add(80);
		
		
		
	    ArrayList<Object> empData = new ArrayList<Object>();
	    empData.add("Mahen");
	    empData.add(17665);
	    empData.add("SAS");
	    empData.add(15000.00);
	    
	    
	    System.out.println(empData);
	    
	    for(Object e: empData) {
	    	System.out.println((e));
	    }
	    
	    System.out.println("object type reserve order");
	    
	    for(int c= empData.size()-1; c>=0 ;c-- ) {
	    	System.out.println(empData.get(c));
	    }
		
		
	}
	

	    

}
