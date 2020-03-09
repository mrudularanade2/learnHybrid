package utility;



import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class helper {

	public static String captureScreenshot(WebDriver driver, String ScreenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		String destination="./Screenshot/"+ScreenshotName+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src, new File(destination));
	
		return destination;
		
	}
}
