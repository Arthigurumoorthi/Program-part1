package javado;

import org.testng.annotations.Test;

public class Methods {

//	private static int add(int i, int j) {
//		return i+j;
//	}
//
//	
//		int sum1 = add(7,8);
//		int sum2 = add(7,10);
//		System.out.println(sum1);
//		System.out.println(sum2);
//	}
//
//}
@Test
	void log1() {
		int a = 10;
		System.out.println(a);
	}
@Test
	void log2() {
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println(c);
		}
@Test
	static void log3() {
		int E=30;
		System.out.println(E);
		
	}
	public static void main(String[] args) {
		Methods net =new Methods();
		net.log1();
		net.log2();
		log3();
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
