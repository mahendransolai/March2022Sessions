package javasessions;

public class Browser {
	
	
	
	
	public String[] getEmpDevices(String empName) {
		
		System.out.println("" +empName);
		
		String product[] = new String[5];
		
		if(empName.equalsIgnoreCase("Divya")) {
			product[0] = "macbook pro";
			product[1] = "macbook air";
			product[2] = "iphone 12";
			product[3] = "ipad";
			product[4] = "apple mouse";
		}
		
		else if (empName.equalsIgnoreCase("Prashant")) {
			
//			product[0] = "window Dell";
//			product[1] = "Samsung s9";
//			product[2] = "Dell Mouse";
			
		
		}
		
		
		else {
			System.out.println("emp name is not found: " + empName);
		}
		
		return product;
	}
	
	
	

	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.getEmpDevices("Dicya");
		
		

	}

}
