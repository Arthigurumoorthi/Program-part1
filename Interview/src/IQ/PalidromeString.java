package IQ;

public class PalidromeString {

	public static void main(String[] args) {
		String Letter="aaba";
          String Letter1 = "";
		for(int i=Letter.length()-1;i>=0;i--) {
//			System.out.print(Letter.charAt(i));
        Letter1=Letter1+Letter.charAt(i);
        System.out.println(Letter1);
		}
		if(Letter.equals(Letter1)) {
			System.out.println("Palidrome");
		}else
			System.out.println("Not Palidrome");
	}


	}
