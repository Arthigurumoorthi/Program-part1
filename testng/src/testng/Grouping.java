package testng;

import org.testng.annotations.Test;

public class Grouping {
	
@Test(groups= {"Apple"})	
public void apple() {
		System.out.println("One model");
	}
@Test(groups= {"Apple"})
public void apple1() {
	System.out.println("One model");
	}
@Test(groups= {"redme"})
public void redme() {
	System.out.println("One new model");
}
@Test(groups= {"redme"})
public void redme1() {
System.out.println("One new model");
}
@Test(groups= {"realme"})
public void realme() {
	System.out.println("model");
}
@Test(groups= {"realme"})
public void realme1() {
System.out.println("model");
}
@Test(groups= {"VIVO"})
public void VIVO() {
	System.out.println("modelS");
}
@Test(groups= {"VIVO"})
public void VIVO1() {
System.out.println("modelS");
}
}
