package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
  
  @Test     
public class Assertions {
	 String id = "arthi";
	public void checkonce() {
		Assert.assertEquals(id, "arthi");
	}

}
