package JavaSessions;

public class Ecommerce {
	
	//method overloading
	//within same class when we have diff methods with same name- login
	// with diff parameters
	// with diff types and no of parameters
	// sequence of param should be different
	//compile(static) time polymorphism - diff forms
	
	
	
	/*
	 * public void login() { // no param System.out.println("login");
	 * 
	 * } public void login(int a) { System.out.println("login"+a);
	 * 
	 * } public void login(int a, String b) { System.out.println("login" +a +b);
	 * 
	 * } public String login(String a, int b) { System.out.println("login"); return
	 * a+b;
	 * 
	 * }
	 */
	public void login() {
		System.out.println("default login");
		
	}
	public void login(String un, String pwd) {// param
		System.out.println("login with" +un +pwd);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ecommerce  obj= new Ecommerce();
        obj.login("admin", "admin");// arguments
	}

}
