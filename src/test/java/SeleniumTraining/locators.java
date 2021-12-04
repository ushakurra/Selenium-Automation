package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class locators {
	WebDriver driver =null;

	
 @Test
    public void f() throws InterruptedException {
	  
	  WebElement username = driver.findElement(By.id("txtUsername"));
	  username.click();
	  username.sendKeys("Admin");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.name("txtPassword")).click();
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  Thread.sleep(2000);
	  
	 driver.findElement(By.className("button")).click();
	  
	 Thread.sleep(2000);
	 }
 

  @Test
  
  public void forgotpassword() throws InterruptedException {
	  
	 // driver.findElement(By.linkText("Forgot your password?")).click();
	  driver.findElement(By.partialLinkText("Forgot")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); 
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
