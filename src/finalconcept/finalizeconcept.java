package finalconcept;

public class finalizeconcept {
	
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {

		finalizeconcept f1= new finalizeconcept();
		
		finalizeconcept f2= new finalizeconcept();
		
		f1= null;
		f2= null;
		
		System.gc();

	
	}

}
