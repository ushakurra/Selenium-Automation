package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Alertbox1 {
	WebDriver driver = null;
  @Test
  public void AlertsexercisewithAccept() throws InterruptedException
  {
   Reporter.log("Inside the Alerts with Accept method");

   
   driver.findElement(By.xpath("//*[@id='SiteNav']/nav/div[1]/div[1]/button")).click();

   
   

  }
  
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.glassdoor.com/index.htm"); 
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
