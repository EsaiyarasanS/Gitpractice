package org.ngtest;

import org.myname.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Indicesclass extends BaseClass {
	@Test(dataProvider="logindata")
	private void logpage(String username,String password) {
		browserLaunch();
		enterUrl("https://www.facebook.com/");
		WebElement id = findLocatorById("email");
		elementSendkeys(id,username);
		WebElement pwd = findLocatorById("pass");
		elementSendkeys(pwd,password);
	}
	@DataProvider(name="logindata",indices= {1,2,3})
	private Object[][] datapr()	{
		Object[][] data=new Object[5][2];
		data[0][0]="esai";
		data[0][1]="esai@123";
		data[1][0]="hari";
		data[1][1]="hari@123";
		data[2][0]="naveen";
		data[2][1]="naveen@123";
		data[3][0]="rajesh";
		data[3][1]="rajesh@123";
		data[4][0]="praveen";
		data[4][1]="praveen@123";
		
		return data;
		
	}
}
