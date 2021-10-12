package OOP_Interface;

public interface USMedical extends WHO {
	//var are static and final by default in interface
	int min_fee=10;
	
	
	//method body is not allowed in interface
	
	//we cannot create obj of interface
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	public void dermaServices();
	public void emergencyServices();
	

}
