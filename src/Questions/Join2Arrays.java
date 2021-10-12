package Questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class Join2Arrays {

	public static void main(String[] args) {
		String[] batsman= {
				"A",
				"B",
				"C"};
		
		String[] bowlers= {
				
				"X",
				"Y",
				"Z"};
		
		Stream<String> sBat=Arrays.stream(batsman);
		Stream<String> sBow=Arrays.stream(bowlers);
		
		String fullTeam[] = Stream.concat(sBat, sBow).toArray(size -> new String[size]);
		
		for (String s:fullTeam) {
			System.out.println(s);
		
				
		}
		
	}

}
