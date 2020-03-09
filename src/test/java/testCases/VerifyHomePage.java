package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appPages.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import utility.helper;

public class VerifyHomePage {

	WebDriver driver;
	@BeforeMethod

	public void setup() throws IOException {

		driver= BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getconfig().getAppUrl());
	}



	@Test
	public void VerifyHomePages() throws IOException
	{		
		HomePage home= PageFactory.initElements(driver, HomePage.class);
		String title= home.homepageTitle();
		System.out.println("Page Title= "+title);
		Assert.assertTrue(title.contains("Welcome: Mercury Tours fff"));
	}

	@AfterMethod

	public void closetest(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			
			String path= helper.captureScreenshot(driver, result.getName());
			System.out.println("Find the screenshot at : "+path);
		}

		BrowserFactory.closeBrowser();
	}


}
