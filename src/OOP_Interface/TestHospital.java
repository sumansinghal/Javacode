package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		
		FortisHospital FH= new FortisHospital();
		FH.cardioServices();
		FH.dentalServices();
		FH.dermaServices();
		FH.emergencyServices();
		FH.entServices();
		FH.neuroServices();
		FH.medicalInsurance();
		FH.medicalTraining();
		FH.helpDesk();
		FH.billing();
		FH.covid19Test();
		FH.pandemicAnnouncement();
		System.out.println(USMedical.min_fee);
		
		//top casting: child class object can be referred by parent interface ref var
	     USMedical us= new FortisHospital();
	     us.physioServices();
	     us.emergencyServices();
	     us.dermaServices();
	     us.dentalServices();
	     
	     UKMedical uk= new FortisHospital();
	     uk.pediaServices();
	     //downcasting at complile time//NA
	     //parent and referred by child
	     
	
	
	}

}
