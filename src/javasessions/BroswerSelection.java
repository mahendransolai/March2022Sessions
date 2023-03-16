package javasessions;

import java.util.ArrayList;

public class BroswerSelection {

	public int getBrowser() {
		
		System.out.println("ChromeBrowser");
		
		int a = 10;
		int b = 20;
		int c = a+ b;
		
		return c;
		
		
	}
	
	public String  getFamily(String name ){
		
		String familymember = "nobody";
	
		if(name.equals ("Mahen")){
			familymember =  "Dad";
			System.out.println("Family member found:" + familymember);
			
		}
		
		else if(name.equals("Priya")) {
			familymember = "Mom";		
			System.out.println("Family member found:" + familymember);
		}
		
		else if(name.equals ("Aarush")){
			familymember = "Big Man";
			System.out.println("Family member found:" + familymember);		
		}
		else if(name.equals ("Arjun")){
			familymember = "Little Man";
			System.out.println("Family member found:" + familymember);		
		}
				
		
		else {
			System.out.println(name + " is not a family..... "+ familymember);
		}
		
		return familymember ;
	}
	
	
	//Method = getBrowseInfo
	//input = browserName
	//return = browername, version , vendor
	
	
	// watch return ---> ArrayList of Object
	public ArrayList<Object> getBroswerInfo(String browser ) {
		
//		System.out.println("Browser Info : ");
		ArrayList<Object> browserList = new ArrayList<Object>(); //Notes for me 
		
		if(browser.trim().equalsIgnoreCase ("chrome")) {
				
			browserList.add("63.8");
			browserList.add("Google Inc");
					
		}
		
		if(browser.trim().equalsIgnoreCase ("firefox")) {
			
			browserList.add("23.65");
			browserList.add("MOzila Inc");
					
		}
		if(browser.trim().equalsIgnoreCase ("safari")) {
			
			browserList.add("2.5");
			browserList.add("Apple Inc");
					
		}
		else {
			System.out.println("browser not found...");
		}
		
		return browserList;
	
	}
	
	
	public boolean isBrowserLaunched(String browserName) {
		System.out.println("Cross Browser Logic");
		boolean flag = false;
		
		switch(browserName.toLowerCase()) {
		case "chrome":
			System.out.println("Chrome Launched");
			flag = true;
			break;
		case "safari":
			flag = true;
			break;
			
		default:
			System.out.println("browser is not founf " + browserName);
			break;
		
		}
		
		return flag;
		
	}
	
	
		
	public static void main(String[] args) {
//		System.out.println("selected Broswer");

		BroswerSelection bs = new BroswerSelection();
		
		bs.isBrowserLaunched("chrome");
		
		if(bs.isBrowserLaunched("chrome")) {
			System.out.println("enter url...");
		}
		
		
		ArrayList<Object> brList = bs.getBroswerInfo("chrome");
		System.out.println(brList);
		
		
	
		
		bs.getBrowser();
		System.out.println(bs.getBrowser());
		
		
		bs.getFamily("sd");
		//System.out.println("Family memeber : " + bs.getFamily("Mahen"));
		
	}

}
