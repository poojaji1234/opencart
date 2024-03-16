package pageObjects;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class first {
	@BeforeClass
	public void p()
	{
		System.out.println("beforeclass");
	}

	@Test
	public void pm()
	{

		System.out.println("first");
	}
	@Test
	public void cm()
	{
		System.out.println("second");
	}
}
