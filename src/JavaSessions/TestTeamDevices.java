package JavaSessions;

import java.util.ArrayList;

public class TestTeamDevices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team t1 = new Team();
		ArrayList<String> QADevices = t1.getDeviceList("QA");
		System.out.println(QADevices);
		
		if(QADevices.size() ==3) {
			System.out.println("Pass for QA device count");
			
		}
		if (QADevices.contains("Iphone X")) {
			System.out.println("Iphone X is present");
		}
		
	t1.getDeviceList("emp");
	t1.launchBrowser("CHROME");
		
		
		
	

	}

}
