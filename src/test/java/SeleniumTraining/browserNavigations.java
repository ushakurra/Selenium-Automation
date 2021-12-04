package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class browserNavigations {
	WebDriver driver=null;
  @Test 
 
  
  public void getbrowservalues()
  {
	   /*
		  driver.getTitle();
		  driver.getCurrentUrl();
		  driver.getPageSource();
		  */
		  
		  Reporter.log("page Title :" + driver.getTitle());
		  Reporter.log("page Title :" + driver.getCurrentUrl());
		  Reporter.log("page Source :" + driver.getPageSource());
		  
	   
  }
  
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
 driver = new ChromeDriver();

//driver.get("https://www.google.com/");

driver.navigate().to("https://www.google.com/");

System.out.println("opens google");
Thread.sleep(3000);

driver.manage().window().maximize();

driver.navigate().to("https://www.facebook.com/");
System.out.println("opens Facebook");
Thread.sleep(3000);

driver.navigate().back();
System.out.println("goes back to Google");
Thread.sleep(3000);

driver.navigate().forward();
System.out.println("goes forward");
Thread.sleep(3000);

driver.navigate().refresh();
Thread.sleep(3000);

driver.close();
  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}


