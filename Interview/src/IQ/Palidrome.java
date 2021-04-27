package IQ;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		int number1=number;
		int rev=0;
		while(number!=0) {
			rev=(rev*10)+number%10;
			number=number/10;
			System.out.println(rev);
		}
		if(rev==number1) {
			System.out.println("Palidrome");
		}else
			System.out.println("Not Palidrome");
			
	}

}
