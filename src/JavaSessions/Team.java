package JavaSessions;

import java.util.ArrayList;

public class Team {
	
	
	
	//WAF :give me the team name
	// return the list of devices-->Arraylist<String>
	public ArrayList<String> getDeviceList(String teamName) {
		
		System.out.println("The team name:" +teamName);
		ArrayList<String> deviceList = new ArrayList<String>();
		if(teamName.equals("QA")) {
			deviceList.add("Iphone X");
			deviceList.add("Iphone 7");
			deviceList.add("Samsung");
			
		}
		else if(teamName.equals("Dev")) {
			deviceList.add("Iphone 12");
			deviceList.add("Iphone 8");
			deviceList.add("Samsung7");
		
	}
		else if(teamName.equals("Devops")) {
			deviceList.add("Iphone SE");
			
		}
		
		else {
			System.out.println("Team name is not found..." +teamName);
		}
		
		return deviceList;
}    //WAF input browser name String 
	// return :void 
	public void launchBrowser(String browserName) {
		
			switch (browserName) {
			case "chrome":
				System.out.println("launch chrome");
				break;
			case "firefox":
				System.out.println("launch firefoc");
				break;
			case "safari":
				System.out.println("launch safari");
				break;

			default:
				System.out.println("Please pass right browser name:" +browserName);
				break;
			}
		}
		
   
	
	

}
