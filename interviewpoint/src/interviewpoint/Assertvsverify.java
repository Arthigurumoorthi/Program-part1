package interviewpoint;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertvsverify {
  @Test
	public void asserttest() {
   System.out.println("Before Asseration");
   	Assert.fail();
   	System.out.println("Before Asseration");
  }
  }
//	@Test
//	public void Verify() {
//		SoftAssert asse = new SoftAssert();
//		System.out.println("Before Asseration");
//		asse.fail();
//		
//		System.out.println("Before Asseration");
//		
//	}
//}
