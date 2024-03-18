package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(day4.ExtentReportManager.class)
public class NopCommerceTests {
	
	@Test
	public void f()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		Assert.assertEquals(1, 1);
		
	}

}
