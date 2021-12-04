package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
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


public class RobotClassGlassdoor  {
	WebDriver driver = null;
  @Test
  public void RobotClassGlassdr() throws InterruptedException, AWTException {
	  
	  driver.findElement(By.xpath("//*[@id='SiteNav']/nav/div[2]/div/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("ushakurra@gmail.com");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='userPassword']")).sendKeys("Sleep2020");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id='LoginModal']/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/form/div[3]/div[1]/button")).click();
	  Thread.sleep(5000);	
	  driver.findElement(By.xpath("//*[@id=\"Discover\"]/div/div/div[1]/div/div/div/div/div[2]/div[3]/div[3]/button[1]/span")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"UserProfile\"]/div/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/button")).click();
	  Thread.sleep(5000);	  
	  driver.findElement(By.xpath("//*[@id=\"UserProfile\"]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div/div/div[3]/button[1]/div/b")).click();
	  Thread.sleep(5000);
	    
	 // driver.findElement(By.xpath("//*[@id=\"Discover\"]/div/div/div[1]/div/div/div/div/div[2]/div[4]/div[2]/a")).click();
     // Thread.sleep(5000); 
     // driver.findElement(By.xpath("//*[@id=\"UserProfile\"]/div/div/div/div[2]/div/div[3]/div/div[2]/div[1]/div[1]/button/div[2]")).click();
     // Thread.sleep(5000); 
     // driver.findElement(By.xpath("//*[@id=\"UserProfile\"]/div/div/div/div[2]/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div[3]/button[1]/div/b")).click();
     // Thread.sleep(5000);   
      
	  driver.findElement(By.xpath("//*[@id=\"UserProfile\"]/div/div/article/div/div[2]/div/div[2]/div/span/div/div[2]/div[1]/div[2]/div/label/div[1]/div[2]")).click();
      Thread.sleep(5000); 
         
	
	  
	  // creating object of Robot class
	     Robot rb = new Robot();
	   
	  // copying File path to Clipboard
	     StringSelection str = new StringSelection("C:\\users\\apoth\\usha.txt");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	     Thread.sleep(5000);
	     	     
	      // press Control+V for pasting
	      rb.keyPress(KeyEvent.VK_CONTROL);
	      rb.keyPress(KeyEvent.VK_V);
	  
	     // release Control+V for pasting
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	  
	     // for pressing and releasing Enter
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	     
	     Thread.sleep(5000);
	     Reporter.log("Successfully executed using Robot Class ");
	     
	     driver.findElement(By.xpath("//*[@id=\"UserProfile\"]/div/div/article/div/div[2]/div/div[2]/div/span/div/div[2]/div[3]/button[2]")).click();
	     Thread.sleep(9000); 
	   

  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	     System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().deleteAllCookies();
	     driver.navigate().to("http://www.glassdoor.com");
	     driver.manage().window().maximize(); 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
