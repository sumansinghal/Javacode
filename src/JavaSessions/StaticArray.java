package JavaSessions;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Object Player[] = new Object[6];
//		Player[0]="Mukesh";
//		Player[1]=30;
//		Player[2]="Fast";
//		Player[3]=1986;
//		Player[4]='M';
//		Player[5]=116.9;
//		
//		
//		//for(int n=0;n<Player.length;n++) {
//		//				System.out.println(n+"="+Player[n]);
//		//}
//	int count=0;
//	for(Object n:Player) {
//		//System.out.println(count+ "=" +n);
		//count++;
	//}
			
   int ar[]= new int[5];
   ar[0]=25;
   ar[1]= 11;
   ar[2]=7;
   ar[3]=75;
   ar[4]=56;
   
   int max=ar[0];
   for(int i=0;i<ar.length;i++) {
	   if(ar[i]>max) 
		   max=ar[i];
	   
   }
   
   System.out.println("The largest number is:" +max);
   
   
   
   
	}

}
