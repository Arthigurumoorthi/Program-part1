package IQ;

import java.util.Scanner;

public class PalidromeInt {

	public static void main(String[] args) {
		//reverse int
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int rem=0;
		
		while(number!=0) {
			rem=(rem*10)+number%10;
			number=number/10;
			System.out.println(rem);
					}
		

		
		
//		if(number==number1) {
//			System.out.println("Palidrome");
//		}else
//			System.out.println("not Palidrome");
//	}
	}}


