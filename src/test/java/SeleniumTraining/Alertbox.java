package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Alertbox {
	WebDriver driver = null;
  @Test
  public void AlertsexercisewithAccept() throws InterruptedException
  {
   Reporter.log("Inside the Alerts with Accept method");
         
   //driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
   
   
   driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
   Thread.sleep(5000);
   
   
         Alert alert = driver.switchTo().alert();
         Thread.sleep(5000);
         
         alert.accept();
         Thread.sleep(5000);
         
         Reporter.log("Alert OK button is selected successsfully");     
         
         driver.switchTo().defaultContent();
         
  }
  
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("http://demo.automationtesting.in/Alerts.html"); 
  }

  @AfterTest
  public void afterTest() {
  }

}
