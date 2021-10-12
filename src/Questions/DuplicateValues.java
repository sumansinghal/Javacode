package Questions;

public class DuplicateValues {

	public static void main(String[] args) {

		String infra[]	= {"Amazon", "GCP", "Amazon"};
		
		for(int i=0;i<infra.length;i++) {
			for(int j=i+1;j<infra.length;j++) {
				if(infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
			
		}
				
	}

}
