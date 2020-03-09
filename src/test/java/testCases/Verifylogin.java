package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appPages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;

public class Verifylogin {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {

		driver= BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getconfig().getAppUrl());
	}

	@Test
	public void verifylogin() throws IOException
	{		
		HomePage home= PageFactory.initElements(driver, HomePage.class);
		//home.loginApp("invalidUN", "invalidPW");
		home.loginApp(DataProviderFactory.getexcel().getdata("login", 0, 0),DataProviderFactory.getexcel().getdata("login", 0, 1));
		home.signOut();
	}

	@AfterMethod

	public void closetest() {

		BrowserFactory.closeBrowser();
	}


}
