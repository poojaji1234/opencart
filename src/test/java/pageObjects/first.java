package pageObjects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {
	@BeforeSuite
	public void bs()
	{

		System.out.println("before suit");	
	}
	@AfterSuite
	public void as()
	{

		System.out.println("after suite");	
	}
	@BeforeTest
	public void bt()
	{

		System.out.println("beforetest");	
	}
	@AfterTest
	public void at()
	{

		System.out.println("aftertest");	
	}
	
	@BeforeClass
	public void p()
	{
		System.out.println("beforeclass");
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
