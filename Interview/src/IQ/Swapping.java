package IQ;

public class Swapping {

	public static void main(String[] args) {
		int N1=1;
		int N2=2;
		System.out.println("Before swapping:" +" Mine-"+N1+ " Second-"+N2);
//		int temp = N1;
//		N1=N2;
//		N2=temp;
		
		N1=N1*N2;
		N2=N1/N2;
		N1=N1*N2;
		
		System.out.println("After swapping:" +" Mine-"+N1+ " Second-"+N2);
		

	}

}
