package laegeforeningen_flutter_automation_listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import laegeforeningen_flutter_automation_library.BaseConfiguration;



public class CustomListener extends BaseConfiguration implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failled test");
		takeScreenshot(result.getMethod().getMethodName());
		
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
