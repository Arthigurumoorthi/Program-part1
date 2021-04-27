package testng;

import org.testng.annotations.Test;

public class DependanciesManagement {

	@Test(enabled=true)
	public void employee() {
		System.out.println("First Level");
		}
   @Test(dependsOnMethods = "employee")
	public void teamlead() {
		System.out.println("Second Level");
		
	}
	@Test(dependsOnMethods = "teamlead")
	public void manager() {
		System.out.println("Third Level");
		
	}
}
