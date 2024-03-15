package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {
	public static void main(String[] args)
	{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	
   WebElement element=driver.findElement(By.xpath("//div[@class='_1ch8e_']"));
   element.click();
   
   

	
}
}
