package IQ;

public class ReverseString {

	public static void main(String[] args) {
		String Letter="ABCD";

		for(int i=Letter.length()-1;i>=0;i--) {
			System.out.print(Letter.charAt(i));
//              Letter1=Letter1+Letter.charAt(i);
		}

	}

}
