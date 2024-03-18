package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest1 {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser", "url"})
	void setup(String br, String appurl) throws InterruptedException
	{
        // WebDriverManager.chromedriver().setup();
		if(br.equals("chrome"))
		{
         driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			 driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
         driver.get(appurl);
         driver.manage().window().maximize();
         Thread.sleep(4000);
         
}
	
	@Test(priority=1)
	void testLogo()
	{ 
		try
		{
		  boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		    Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	void testHomePageTitle() 
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM","titles are not matched");
		
	}
	@AfterClass
	void closeApp()
	{
		driver.quit();
}
}
