package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;

public class LoginTestCases 
{
	@Test
	public void login() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	        
		driver.get("https://www.phptravels.net/login");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.click();
		
		
		/*
		 * PageObjects.LoginPageObjects.userName(driver).sendKeys("user@phptravels.com")
		 * ; PageObjects.LoginPageObjects.passWord(driver).sendKeys("demouser");
		 * PageObjects.LoginPageObjects.submitButton(driver).click();
		 * Thread.sleep(2000);
		 */
		
		driver.quit();
			
	}
	
	
}
