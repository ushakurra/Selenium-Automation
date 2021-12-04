package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class SwitchWindow {
	WebDriver driver = null;
  
  @Test
  public void f() throws Exception {
	  driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();   
	  
      String MainWindow=driver.getWindowHandle();  
        
      // To handle all new opened window.    
      Set<String> s1=driver.getWindowHandles();  
      Iterator<String> i1= s1.iterator();  
        
      while(i1.hasNext())   
      {  
          String ChildWindow=i1.next();  
            
          if(!MainWindow.equalsIgnoreCase(ChildWindow))   
          {      
               
                  // Switching to Child window
                  driver.switchTo().window(ChildWindow);                                                                                                            
                  driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                   
                  
                  driver.findElement(By.name("btnLogin")).click();   
                  
                 
   // Closing the Child Window.
                      driver.close();  
          }  
      }  
      // Switching to Parent window i.e Main Window.
          driver.switchTo().window(MainWindow);   
          
		
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException{
	  
	  		     System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		     driver = new ChromeDriver();
		     
		   //   driver.get("https://www.google.com/");
		      
		   //Launching the site.    
		     driver.get("http://demo.guru99.com/popup.php");   
		     driver.manage().window().maximize();  
		     Thread.sleep(3000);
		               
		      
		      driver.manage().window().maximize();
		    }


  @AfterTest
  public void afterTest() {
	// driver.close();
  }

}

