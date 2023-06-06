package org.pom;

import org.myname.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
private WebElement txtusername;
@FindBy(id="pass")
private WebElement txtpassword;
@FindBy(xpath="//button[@value='login']")
private WebElement btnlogin;
public WebElement getTxtusername() {
	return txtusername;
}
public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}

public void login(String username,String Password) {
	elementSendkeys(getTxtusername(),username);
	elementSendkeys(getTxtpassword(),Password);
	elementClick(getBtnlogin());
}
}
