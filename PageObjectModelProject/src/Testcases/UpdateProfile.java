package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;
import PageObjects.UpdateProfileObjects;

public class UpdateProfile 
{

	@Test
	public void update() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Practice\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	        
		driver.get("https://www.phptravels.net/login");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.username.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.submit.click();
		
		PageFactory.initElements(driver, UpdateProfileObjects.class);
		
			
		UpdateProfileObjects.myProfile.click();
		UpdateProfileObjects.phone.sendKeys("9876543210");
		UpdateProfileObjects.city.sendKeys("London");
		//UpdateProfileObjects.updateButton.click();
		
		
		/*
		 * LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		 * LoginPageObjects.passWord(driver).sendKeys("demouser");
		 * LoginPageObjects.submitButton(driver).click();
		 * 
		 * 
		 * UpdateProfileObjects.myProfile(driver).click();
		 * UpdateProfileObjects.phoneNumber(driver).clear();
		 * UpdateProfileObjects.phoneNumber(driver).sendKeys("9876543210");
		 * UpdateProfileObjects.city(driver).sendKeys("London"); Thread.sleep(2000);
		 * UpdateProfileObjects.updateButton(driver).click();
		 */
		
		
		driver.quit();
		
		
				
		/*WebElement userName = driver.findElement(By.name("email"));
		
		userName.sendKeys("user@phptravels.com");
		
		WebElement userPassword = driver.findElement(By.name("password"));
		userPassword.sendKeys("demouser");
		
		
		WebElement loginButton = driver.findElement(By.xpath(("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")));
		
		loginButton.click();		
		
		Thread.sleep(2000);
		
		WebElement myProfile = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
		myProfile.click();
		
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.clear();
		phoneNumber.sendKeys("9876543210"); */
		
		
		
		
			
		
	}
	
}

