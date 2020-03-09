package factory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browsername) throws IOException 
	
	{
	
		if(browsername.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", DataProviderFactory.getconfig().getfirefoxPath());
			driver= new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome"))
	
		{
		
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getconfig().getChromePath());
			driver= new ChromeDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser() {
		driver.quit();;
		
	}
	}

