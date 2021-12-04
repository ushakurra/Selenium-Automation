package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class iframe {
	WebDriver driver = null;
  @Test
  public void f() {
	  
	  Reporter.log("Inside the iframe class");
	  
  }
  
  @Test
  public void iframeOperation() throws InterruptedException
  {
  driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='eduFooterWrap']//iframe[1]")));
  Thread.sleep(5000);
  
  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SoftwareTestingHelp.com");
  Thread.sleep(5000);
  
  driver.switchTo().defaultContent();
  }
  
  
  @BeforeTest

	  public void beforeTest() throws InterruptedException {
		     
		     System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		     driver = new ChromeDriver();
		     
		   //   driver.get("https://www.google.com/");
		      
		      driver.navigate().to("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction");
		      
		       Thread.sleep(3000);
		      
		      driver.manage().window().maximize();
		    }

 
  
  

  @AfterTest
  public void afterTest() {
	//  driver.close();
  }

}
