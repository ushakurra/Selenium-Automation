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

public class HoverOver {
	
  WebDriver driver = null;
  
  @Test
  public void MouseHoverOperation() throws InterruptedException
  {
  
  // WebElement mainmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
  //  WebElement mainsubmenu1 = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
   
	  WebElement mainmenu1 = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
	  
	  WebElement mainsubmenu1 = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
  
      Actions actobj = new Actions(driver); 
      actobj.moveToElement(mainmenu1).moveToElement(mainsubmenu1).click().perform();
      
    
   
   Reporter.log("Mouse Hover operation performed successfully");
   
  Thread.sleep(5000);
  }

  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");			  
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();	 
	     driver.navigate().to("https://demo.opencart.com/");
	     }


  @AfterTest 
  public void afterTest() {
  }

}
