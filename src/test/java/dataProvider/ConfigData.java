package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {
	Properties pro;
	
	public ConfigData() throws IOException
	{
		File src= new File("./Configuration/ConfigData.properties");
		FileInputStream fis=  new FileInputStream(src);
		
		pro = new Properties();
		pro.load(fis);
		
	}
	
	public String getAppUrl()
	{
		String urlvalue= pro.getProperty("url");
		return urlvalue;
	}
	
	public String getChromePath()
	{
		String chromePathvalue= pro.getProperty("chromePath");
		return chromePathvalue;
	}
	
	public String getfirefoxPath()
	{
		String firefoxPathvalue= pro.getProperty("chromePath");
		return firefoxPathvalue;
	}

}
