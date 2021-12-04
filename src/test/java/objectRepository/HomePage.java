package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

                 
			WebDriver driver ;

				public HomePage(WebDriver driver) {

							this.driver =driver ;
	  
	  
				}
						

				By link = By.linkText("Create a new account");
				
				public WebElement Homepage() {
        	
        	
        	return driver.findElement(link);
        }
     

}
			
