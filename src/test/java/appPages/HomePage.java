package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	
	static WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	
	@FindBy(name="userName") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(name="login") WebElement loginBtn;
	//@FindBy(linkText="SIGN-OFF") WebElement signout;
	
	By signout = By.linkText("SIGN-OFF");

	
	public String homepageTitle()
	{
		return driver.getTitle();
	}
	
	public void loginApp(String userid, String pwd)
	{
		username.sendKeys(userid);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void signOut() {
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(signout));
		System.out.println("text after signin= "+ele.getText());
		
		Assert.assertEquals(ele.getText(), "SIGN-OFF");
		driver.findElement(signout).click();
	}
}
