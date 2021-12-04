package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
		
	  WebDriver driver ;
	 
	  public LoginPage(WebDriver driver) {
	  
		  this.driver =driver ;	  		  
	  }
	  
	  By username = By.xpath("//*[@id=\"login1\"]");
	  By password =By.xpath("//*[@id=\"password\"]");
	  By signin = By.className("signinbtn");
	  
	    
	  public WebElement emailId() {
		  return  driver.findElement(username);		  
	  }
	  
	  public WebElement password() {
		  
		  return driver.findElement(password);
	  }
	
	  public WebElement signin(){
		  return driver.findElement(signin);
	  }
		

}