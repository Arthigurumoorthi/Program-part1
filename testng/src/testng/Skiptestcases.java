package testng;

import org.testng.annotations.Test;

public class Skiptestcases {
	public class Realtime {
		

		@Test(priority=1)
			public void newshop() {
				System.out.println("Cloth shop");
			}
		
		
		
		@Test(priority=3,enabled = false)
		public void thereareoffers() {
			System.out.println("10%");
		}
		
		
		@Test(priority=0)
			public void kurtis() {
				System.out.println("Kurtis");
			}
		@Test(priority=2)
			public void shirt() {
				System.out.println("goood");
			}

		}

}
