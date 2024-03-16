package pageObjects;

import org.testng.annotations.DataProvider;

/*
 loginByFacebook  -sanity
 loginByTwitter   -regression
 loginByEmail     -sanity
 */

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups= {"sanity"})
  public void loginByFacebook() {
	  System.out.println("this is login by email");
  }
  
  @Test
  public void loginByTwitter() {
	  System.out.println("this is login by twitter");
  }
  
  @Test
  public void loginByEmail() {
	  System.out.println("this is login by Email");
  }
  @DataProvider
  public void dp()
  {
	  
  }
  
}
