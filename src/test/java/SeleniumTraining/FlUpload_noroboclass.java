package SeleniumTraining;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FlUpload_noroboclass  {
	
	WebDriver driver = null;
	
	@Test
	
	
	public void sendkeyexercise() throws InterruptedException 
	   
	   {
	//  Thread.sleep(1000);  
	     
	  //Selenium cannot identify Windows based application
	  //Using SendKeys methods   

	  WebElement button = driver.findElement(By.cssSelector("input#file-upload"));
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver; 
	  js.executeScript("arguments[0].click();",button); //Click action on the button
	   
	  
	     //click on ‘Choose file’ to upload the desired file
	  button.sendKeys("C:\\Users\\apoth\\usha.txt"); //Uploading the file using sendKeys
	  System.out.println("File is Uploaded Successfully");
	         
	      Reporter.log("Successfully executed using Sendkeys "); 
	   
	 // Thread.sleep(8000);
	  
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
  