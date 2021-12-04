   package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class RobotClass {
	WebDriver driver = null;
  //@Test
  //public void f() {
	  
//	   }
  
  
  @Test
  public void robotclass() throws AWTException, InterruptedException
  { 
   //Selenium cannot identify Windows based application
   //Robot Class methods   

   WebElement button = driver.findElement(By.cssSelector("input#file-upload"));
   JavascriptExecutor js = (JavascriptExecutor) driver; 
   js.executeScript("arguments[0].click();",button); //Click action on the button
   Thread.sleep(2000); 
   
      // copying File path to Clipboard
      StringSelection str = new StringSelection("C:\\Users\\apoth\\usha.txt");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
      
   // creating object of Robot class
      Robot rb = new Robot();
      
       // press Control+V for pasting
       rb.keyPress(KeyEvent.VK_CONTROL);
       rb.keyPress(KeyEvent.VK_V);
   
      // release Control+V for pasting
      rb.keyRelease(KeyEvent.VK_CONTROL);
      rb.keyRelease(KeyEvent.VK_V);
   
      // for pressing and releasing Enter
      rb.keyPress(KeyEvent.VK_ENTER);
      rb.keyRelease(KeyEvent.VK_ENTER);
      
     // Thread.sleep(8000);
      Reporter.log("Successfully executed using Robot Class ");
      
    }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().deleteAllCookies();
	     driver.navigate().to("https://www.monsterindia.com/seeker/registration");
	     
	     
  }

  @AfterTest
  public void afterTest() {
  }

}
