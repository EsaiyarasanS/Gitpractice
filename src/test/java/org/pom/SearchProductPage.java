package org.pom;

import org.myname.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage extends BaseClass {
	public SearchProductPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[@data-testid='username']")
private WebElement txtlogmsg;
@FindBy(xpath="//a[text()=' Go To Cart ']")
private WebElement btngotocart;
@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
private WebElement btnclose;
@FindBy(id="search")
private WebElement txtsearchproduct;   
@FindBy(xpath="//i[@class='fa fa-search colorWhite']")
private WebElement lnksearch;
@FindBy(xpath="//h5[@class='sectionTitle font35 font-weight-bold color11']")
private WebElement txtsearchmsg;
@FindBy(xpath="//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17']")
private WebElement lnkadd;
@FindBy(id="cart-21")
private WebElement btnadd;
public WebElement getTxtlogmsg() {
	return txtlogmsg;
}
public WebElement getBtngotocart() {
	return btngotocart;
}
public WebElement getBtnclose() {
	return btnclose;
}
public WebElement getTxtsearchproduct() {
	return txtsearchproduct;
}
public WebElement getLnksearch() {
	return lnksearch;
}
public WebElement getTxtsearchmsg() {
	return txtsearchmsg;
}
public String getsearmsg() {
	String text = elementGetText(getTxtsearchmsg());
	return text;
}
public WebElement getLnkadd() {
	return lnkadd;
}
public WebElement getBtnadd() {
	return btnadd;
}
public String getlogmsg() {
	String logsucmsg = elementGetText(getTxtlogmsg());
	return logsucmsg;
	}

public void addproduct(String productname) {
	
	//elementClick(getBtngotocart());
	//elementClick(getBtnclose());
	elementSendkeys(getTxtsearchproduct(),productname);
	elementClick(getLnksearch());
	elementClick(getLnkadd());
	elementClick(getBtnadd());

}
}
