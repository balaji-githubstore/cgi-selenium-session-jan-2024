package com.cgi.utils;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public String[][] commonDataProvider(Method mtd) throws IOException
	{
		//sheetname and testmethod name should be same
		
		//below code gets the current @Test method name
		String testMethodName=mtd.getName();
		
		String[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("test_data/OpenEMRData.xlsx", testMethodName);
		return data;
	}
	
	@DataProvider
	public String[][] validLoginData()
	{
		String[][] data=new String[2][3];
		
		data[0][0]="admin";
		data[0][1]="pass";
		data[0][2]="OpenEMR";
		
		data[1][0]="accountant";
		data[1][1]="accountant";
		data[1][2]="OpenEMR";
		
		return data;
	}
	
	
	
	
}
