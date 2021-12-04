package SeleniumTraining;

import org.testng.annotations.Test;

import com.automation.utility.ExcelDataProvider;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SignOut {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//button[contains(text(),'Get Started')]")).click();
	  Thread.sleep(3000);
	  
	  ExcelDataProvider provider = new ExcelDataProvider();
	  String[][] data = provider.getData();
	  int rowLength = data[0].length;

	  
	 for (int i=0; i<= rowLength; i++)  				 
		  {   
		 
		 System.out.println("row length is " +  rowLength);
		 System.out.println("i value" +  i);
			
	  
	  driver.findElement(By.linkText("Sign in")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys(data[i][0]);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys(data[i][1]);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/form[1]/input[4]")).click();
	  Thread.sleep(3000);
	  
	 if(driver.getPageSource().contains("Invalid Username")) {
		 
		 System.out.println("Invalid Credentials");
		
			 
	 }
	 else {
		 System.out.println("valid Credentials"); 
		 
		 //Clicking on Get Started for Data Structures Introduction  
		  driver.findElement(By.linkText("Get Started")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.linkText("Sign out")).click();
		  Thread.sleep(3000);
		 
	 }
	
		}
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://dsportalapp.herokuapp.com/");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
	//  driver.close();
  }

}
