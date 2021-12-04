package SeleniumTraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class CheckboxExercise {
	
	
	WebDriver driver=null;
	
  @Test
public void checkbox() throws InterruptedException {
	//IsDisplayed
	  driver.findElement(By.id("checkbox1"));
	  Reporter.log("Checkbox usha test : " + driver.findElement(By.id("checkbox1")).isDisplayed());

  }

  @Test
  //To select all the Checkbox using Dynamically
  public void selectallcheckbox() throws InterruptedException
  {
   
   //Java Collections - List
   //Java for...each loop
  
  
   
   //Select all the checkbox 
	  
	  
   List checkboxcount = driver.findElements(By.xpath("//input[@type='checkbox']"));
   Reporter.log("Dynamically Number of Checkbox is : " + checkboxcount.size()); //Count of checkbox
   
 
   
   //using for...each loop    
   for(WebElement chkboxvalue : checkboxcount) //directly assigning it to the webelement reads the checkboxes one after the other
   {
    chkboxvalue.click();
   
    Reporter.log("Selected Checkbox ID : " + chkboxvalue.getAttribute("id"));
    
    Reporter.log("Selected Checkbox Value :  " + chkboxvalue.getAttribute("value"));
   }   
   
   Thread.sleep(5000);   
  }
  //To select all the Checkbox using Dynamically
 
  
  @BeforeTest
  public void beforeTest() {
  
//Navigate to the url
  driver.navigate().to("http://demo.automationtesting.in/Register.html"); 
 
  }
  @AfterTest
  public void afterTest() {
  }

}




