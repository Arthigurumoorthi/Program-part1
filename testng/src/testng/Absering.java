package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Absering implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case going to execte");
		
	}
	@Override
   public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Passed");
		
	}
	@Override
   public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed");
		
	}
	@Override
   public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped");
	}
	@Override
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case Failed but Percentage viewed");
	}
	@Override
   public void onStart(ITestContext result) {
		System.out.println("Test case Starded");
	}
	@Override
   public void onFinish(ITestContext result) {
		System.out.println("Test case Finished");
  	}
}
