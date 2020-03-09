package factory;

import java.io.IOException;

import dataProvider.ConfigData;
import dataProvider.excelData;

public class DataProviderFactory {
	
	public static ConfigData getconfig() throws IOException
	{
		ConfigData config = new ConfigData();
		
		return config;
	}

	public static excelData getexcel() throws IOException
	{
		excelData excel= new excelData();
		return excel;
		
	}
}
