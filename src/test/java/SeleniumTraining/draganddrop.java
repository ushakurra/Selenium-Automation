package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class draganddrop {
	
	WebDriver driver = null;
  
  @Test

  public void dragdropoperation() throws InterruptedException 
 
 {
  WebElement dragimage1 = driver.findElement(By.id("box6"));
  WebElement dropimage1 = driver.findElement(By.id("box106"));
  WebElement dragimage2 = driver.findElement(By.id("box3"));
  WebElement dropimage2 = driver.findElement(By.id("box103"));
  
  
  
  //Action Class
  Actions actobj = new Actions(driver); 
  
  actobj.dragAndDrop(dragimage2, dropimage2).perform();
  
  actobj.dragAndDrop(dragimage1, dropimage1).perform(); //drag and drop
  
  Reporter.log("Drag and drop performed successfully");
  
  Thread.sleep(1000);  
  
 }

  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  driver = new ChromeDriver();	  
	  driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
