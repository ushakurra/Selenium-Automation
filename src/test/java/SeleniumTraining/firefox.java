package SeleniumTraining;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
 
 
  WebDriver driver=null;
  
 @Test
  
  public void f() {
	  
	  Reporter.log("HOMEWORK page url   " +driver.getCurrentUrl());
	  Reporter.log("page Title :" + driver.getTitle());
	  Reporter.log("page Source :" + driver.getPageSource());
  }
  
 
  @BeforeTest
  
  public void setuptest() throws InterruptedException {
	  
	  System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	 driver = new FirefoxDriver(); 
	
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }
 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
