package org.ngtest;


	import org.myname.BaseClass;
	import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class Optionalpara  extends BaseClass {
		@Parameters({"username1","password1"})
		@Test
		private void logpage(@Optional("admin")String username,@Optional("admin@123")String password) {
			browserLaunch();
			enterUrl("https://www.facebook.com/");
			WebElement id = findLocatorById("email");
			elementSendkeys(id,username);
			WebElement pwd = findLocatorById("pass");
			elementSendkeys(pwd,password);
		}
	}


