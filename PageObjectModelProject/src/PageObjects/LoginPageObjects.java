package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects 
{
	@FindBy(name="email")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement submit;

 
	
	
	
	/*
	 * public static WebElement passWord(WebDriver driver) { return
	 * driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement submitButton(WebDriver driver) { return
	 * driver.findElement(By.xpath((
	 * "//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"))); }
	 * 
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.name("email"));
	 * 
	 * }
	 */
}
