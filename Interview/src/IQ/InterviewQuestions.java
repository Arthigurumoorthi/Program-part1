package IQ;
public class InterviewQuestions {
//fib Series 0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		
		for(int i = 0; i<8; i++) {//looping the given numbers
			if(i==5) {
				break;
			}
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n1);
		}
		
	}

}
