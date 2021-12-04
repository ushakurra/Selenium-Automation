package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class radiobutton {
	WebDriver driver = null;
  @Test
  public void f() throws InterruptedException {
	  
	//To select the specific radiobutton  
	   driver.findElement(By.xpath("//input[@value='Male']")).click();
	   Reporter.log("Radio button is selected successfully");   
	   Thread.sleep(500);
  }
  @BeforeTest
  public void beforeTest() {
	//Navigate to the url
	  driver.navigate().to("http://demo.automationtesting.in/Register.html"); 
  }

  @AfterTest
  public void afterTest() {
  }

}
