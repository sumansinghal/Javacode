package JavaSessions;

public class StaticMethod {

	
	public static void sendMail() {
		System.out.println("send mail");
	}
	
	public void getMail() {
		System.out.println("get mail");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StaticMethod obj = new StaticMethod();
      // non static method
      //by using object
      obj.getMail();
      // static methoid called by class name
      
      StaticMethod.sendMail();
	}

}
