package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects 
{
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
	public static WebElement myProfile;
	
	@FindBy(name="phone")
	public static WebElement phone;
	
	@FindBy(name="city")
	public static WebElement city;
	
	/*
	 * @FindBy(xpath
	 * ="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	 * public static WebElement updateButton;
	 */
	
	
	
	
	
	/*
	 * public static WebElement myProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));
	 * 
	 * }
	 * 
	 * public static WebElement phoneNumber(WebDriver driver) { return
	 * driver.findElement(By.name("phone"));
	 * 
	 * }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city"));
	 * 
	 * }
	 * 
	 * public static WebElement updateButton(WebDriver driver) { // TODO
	 * Auto-generated method stub return driver.findElement(By.xpath(
	 * "//html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"
	 * )); }
	 */
}
