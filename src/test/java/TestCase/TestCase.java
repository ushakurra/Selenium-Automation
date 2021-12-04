package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class TestCase {
	
	
	@Test
	public void login ()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
	 LoginPage rd = new LoginPage(driver);
	 
	 HomePage rh = new HomePage(driver);
	 
	 rd.emailId().sendKeys("ushakurra");
	 rd.password().sendKeys("Sleep2020");
	 rd.signin().click();
	 
   //rd.driver.findElement(By.xpath("//*[@id=\"password\").sendkeys("jmattalwar@gmail.com");
	  
	rh.Homepage().click();
	
	}
	
	
	
	
	
}