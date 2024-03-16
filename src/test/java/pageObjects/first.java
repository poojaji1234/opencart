package pageObjects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class first {
	@BeforeClass
	public void p()
	{
		System.out.println("beforeclass");
	}

	@BeforeSuite
	public void s()
	{
		System.out.println("before suite");
	}
	@Test(priority=1)
	public void pm()
	{

		System.out.println("first");
	}
	@Test(priority=2)
	public void cm()
	{
		System.out.println("second");
	}
	
	@AfterClass
	public void a()
	{

		System.out.println("afterclass");
	}
}
