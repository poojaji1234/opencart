package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class second {
	///public static void main(String[] args)
	//{
	@Test
	public void vpo() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	
   WebElement element=driver.findElement(By.xpath("//div[@class='_1ch8e_']"));
   element.click();
   
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//class HelloWorld {
  //  public static void main(String[] args) {
    // char ch='e';
      //  System.out.println((char)(ch+1));
    //}
}
}

	
//}

