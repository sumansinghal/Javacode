package BuilderPattern;

public class Registration {
	
	private String firstName;
	private String lastName;
	private String city;
	private int mobile;
	
	
	public Registration(String firstName, String lastName, String city, int mobile) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public void doRegisttration(Registration registration) {
		registration.getFirstName();
		registration.getLastName();
		registration.getCity();
		registration.getMobile();
		System.out.println("fill form:"+registration.getFirstName()+ " "+registration.getLastName()
		+" "+registration.getCity()+" "+registration.getMobile());




	}
}
