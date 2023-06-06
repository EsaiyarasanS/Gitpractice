package org.ngtest;

import org.myname.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classparameter extends BaseClass {
	@Parameters({"username0","password1"})
	@Test
	private void logpage(String username,String password) {
		browserLaunch();
		enterUrl("https://www.facebook.com/");
		WebElement id = findLocatorById("email");
		elementSendkeys(id,username);
		WebElement pwd = findLocatorById("pass");
		elementSendkeys(pwd,password);
	}
}
