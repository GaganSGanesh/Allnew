package com.facebook.automate;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.excelUtility;

public class newTcDDT extends baseclass{
	
	@Test
	public void signup() {
	}
	@DataProvider(name="SignData")
	String  [] [] getdata()
	{
		excelUtility exe=new excelUtility();
		String path=System.getProperty("./data/fbRandom.xlsx");
		int rowno=exe.g
		return null;
		
	}

}
