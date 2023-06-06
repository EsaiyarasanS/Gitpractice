package org.pom;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.myname.BaseClass;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;


public class ExecutePage extends BaseClass {
	@BeforeClass
	 public static void browserSetup(){
		  browserLaunch();
		  enterUrl("https://omrbranch.com/");
		  maximizeWindow();
		  implicityWait();
	  }
	  @AfterClass
	  public static void afterclass(){
		 quitWindow();
	}
	@Test
	  public void page() throws IOException, InterruptedException{
		  Loginpage lp=new Loginpage();
		  lp.login(readExcelData("SheetName", 1,0), readExcelData("SheetName", 1, 1));
		  
		  SearchProductPage sp=new SearchProductPage();
		  String getlogmsg = sp.getlogmsg();
		  Assert.assertEquals("verify after login message", "Welcome Esaiyarasan", getlogmsg);
		  sp.addproduct(readExcelData("SheetName", 1, 2));
		  String getsearmsg = sp.getsearmsg();
		  Assert.assertEquals("verify after search message","Search Result - nuts",getsearmsg );
		  Thread.sleep(6000);
		  
		  CheckinPage cp=new CheckinPage();
		  Thread.sleep(3000);
		  cp.placeorder(readExcelData("SheetName", 1, 4), readExcelData("SheetName", 1, 5), readExcelData("SheetName", 1, 6),readExcelData("SheetName", 1, 7), readExcelData("SheetName", 1, 8),readExcelData("SheetName", 1, 9),readExcelData("SheetName", 1, 10),readExcelData("SheetName", 1,11));
		  Thread.sleep(3000);
		  String ordermsg = cp.ordermsg();
		  Assert.assertEquals("verify after search message","Order Details",ordermsg);
		 
	  }

}
