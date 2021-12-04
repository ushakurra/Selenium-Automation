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

public class RoboJaanvi  {
	
	WebDriver driver = null;
	
	@Test
	 public void roboclass() throws AWTException, InterruptedException
	 { 
	  //Selenium cannot identify Windows based application
	  //Robot Class methods   
		
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();
		
		Thread.sleep(2000); 
	
	  
	  // creating object of Robot class
	     Robot rb = new Robot();
	   
	  // copying File path to Clipboard
	     StringSelection str = new StringSelection("C:\\users\\apoth\\usha.txt");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	     
	     
	     Thread.sleep(2000);
	     
	  
	     
	     
	      // press Control+V for pasting
	      rb.keyPress(KeyEvent.VK_CONTROL);
	      rb.keyPress(KeyEvent.VK_V);
	  
	     // release Control+V for pasting
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	  
	     // for pressing and releasing Enter
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     
	     Thread.sleep(8000);
	     Reporter.log("Successfully executed using Robot Class ");
	     
	   }
	
	
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().deleteAllCookies();
	  
	  driver.navigate().to("https://www.monsterindia.com/seeker/registration");
	  Thread.sleep(1000);
	  
	  Reporter.log("Automation Practice Website Opens");
	  Thread.sleep(1000);
	  
	  driver.manage().window().maximize();
	    
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  driver.quit();

  }
  
  }
  