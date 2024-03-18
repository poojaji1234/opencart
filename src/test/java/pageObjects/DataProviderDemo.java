package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

  
public class DataProviderDemo {
	
  WebDriver driver;
 // WebDriver driver=new ChromeDriver();
  
  @BeforeClass
  public void setup() throws InterruptedException
  {
  
     driver=new ChromeDriver();
    // driver.get("https://demo.nopcommerce.com/login");  
    Thread.sleep(2000);
}
  
  @Test(dataProvider="dp")
  void testLogin(String email, String pwd) throws InterruptedException
  
  {
	  driver.get("https://demo.nopcommerce.com/login");  
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pwd);
	
	  driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	  
	  String exp_title= "nopCommerce demo store. Login";
	  String act_title=driver.getTitle();
	  
	   Assert.assertEquals(exp_title, act_title);
	  
  }
  
  @AfterClass
  public void feardown()
  {
	  driver.close();
  }
  
  @DataProvider(name="dp")
  String [][] loginData()
  {
      String data[][]= { 
    		               { "poojadahiya9@gmail.com", "Test@123" },
    		               { "poojadahiya9@gmail.com", "Test@123" }
    		             };
    		             		
    	  return data;
      }
  
  
  
}
