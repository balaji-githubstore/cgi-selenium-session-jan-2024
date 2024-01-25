package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ZDemo1Test {
	
	@DataProvider
	public String[][] validData()
	{
		String[][] data=new String[3][2];
		//i --> number of test case
		//j --> number of parameters
		data[0][0]="john";
		data[0][1]="john123";
		
		data[1][0]="peter";
		data[1][1]="peter123";
		
		data[2][0]="saul";
		data[2][1]="saul123";
		
		return data;
	}
	
	@Test(dataProvider = "validData")
	public void validTest(String username,String password)
	{
		System.out.println("valid login");
	}

}
