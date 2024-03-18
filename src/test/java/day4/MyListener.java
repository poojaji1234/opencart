package day4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println("test started....");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("on test passed....");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(" on test failed....");
	}
	

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("on test skipped....");
	}
	
	
	public void onFinish(ITestContext result)
	{
		System.out.println("on test finish....");
	}
	
	

}
