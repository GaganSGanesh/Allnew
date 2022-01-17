package com.facebook.automate;

import org.testng.annotations.Test;

import Generic.excelUtility;

public class EXCELCHECCK {
@Test
public void check() {
excelUtility eutil=new excelUtility();
int rowcount=eutil.getData("Sheet1", 0, 0)


}

}
