package javasessions;

public class EnvironmentSelection {

	public static void main(String[] args) {
		System.out.println("Pick yout environment for test to run: ");
		
		String env = "INT";
		
		switch (env.toLowerCase().trim()) {
		case "main":
			System.out.println("Test running in main environment ");
			
			break;
		case "int":
			System.out.println("Test running in Intergration environment ");
			
			break;
		case "pbranch":
			System.out.println("Test running in personal environment ");
			
			break;
		default:
			System.out.println("Please select correct environment to run test");
		
			break;
		}

	}

}
