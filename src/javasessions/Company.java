package javasessions;

import java.util.ArrayList;

public class Company {
	
	//WAF: name -> getBrowserInfo
	//(browsername , version, vendor)
	//return browserInfo
	
	
	public ArrayList<Object> getBrowserInfo(String browser) {
		
		ArrayList<Object> browserInfo = new ArrayList<Object>();
			
		if(browser.equals("chrome")) {
			browserInfo.add("Google chrome");
			browserInfo.add("98.02");
			browserInfo.add("Google");
		}
		else {
			System.out.println("Right browser please");
		}
		return browserInfo;
	}
	
	
	

	public static void main(String[] args) {
		
		Company comp = new Company();
		ArrayList<Object> brList = comp.getBrowserInfo("chrome");
		System.out.println(brList);
	}

}
