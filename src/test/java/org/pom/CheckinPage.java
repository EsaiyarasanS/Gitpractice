package org.pom;

import java.io.IOException;

import org.myname.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckinPage extends BaseClass {
	public CheckinPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=' Go To Cart ']")
	private WebElement btngotocart;
	@FindBy(xpath="//h5[text()='My Cart']")
	private WebElement txtcartmsg;
	@FindBy(xpath="//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']")
	private WebElement btnaddress;
	@FindBy(xpath="//select[@name='address_type']")
	private WebElement selectaddrtype;
	@FindBy(xpath="//input[@placeholder='First name*']")
	private WebElement txtfirstname;
	@FindBy(xpath="//input[@placeholder='Last name*']")
	private WebElement txtlastname;
	@FindBy(xpath="//input[@placeholder='Contact No*']")
	private WebElement txtcontactno;
	@FindBy(xpath="//input[@placeholder='House No*']")
	private WebElement txthouseno;
	@FindBy(xpath="//input[@placeholder='Address*']")
	private WebElement txtadress;
	@FindBy(xpath="//select[@name='state']")
	private WebElement selectstate;
	@FindBy(xpath="//select[@name='city']")
	private WebElement selectcity;
	@FindBy(xpath="//input[@name='zipcode']")
	private WebElement txtzipcode;
	@FindBy(xpath="//button[@class='saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']")
	private WebElement btnsave;
	@FindBy(id="payment_type")
	private WebElement selectpaymenttype;
	@FindBy(xpath="//label[text()=' Visa ']")
	private WebElement btnvisa;
	@FindBy(xpath="//input[@class='form-control mt-2']")
	private WebElement txtcardno;
	@FindBy(id="month")
	private WebElement selectmonth;
	@FindBy(id="year")
	private WebElement selectyear;
	@FindBy(xpath="//input[@placeholder='CVV']")
	private WebElement txtcvv;
	@FindBy(id="placeOrder")
	private WebElement btnplaceorder;
	@FindBy(xpath="//h5[text()='Order Details']")
	private WebElement txtordermsg;
	
	@FindBy(xpath="//p[@class='font18 color20 fontSemiBold mb-0']")
	private WebElement btnorderid;
	public WebElement getTxtordermsg() {
		return txtordermsg;
	}
	public String ordermsg() {
		String ordermsg = txtordermsg.getText();
		return ordermsg;
	}
	
	public WebElement getBtnorderid() {
		return btnorderid;
		
	}
	
	public String getorderid() {
		String text = btnorderid.getText();
		return text;
	}
	public WebElement getBtngotocart() {
		return btngotocart;
	}

	public WebElement getTxtcartmsg() {
		return txtcartmsg;
	}
	public String getcartmsg() {
		String cart = elementGetText(getTxtcartmsg());
		return cart;
	}
	public WebElement getBtnaddress() {
		return btnaddress;
	}
	public WebElement getSelectaddrtype() {
		return selectaddrtype;
	}
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtcontactno() {
		return txtcontactno;
	}
	public WebElement getTxthouseno() {
		return txthouseno;
	}
	public WebElement getTxtadress() {
		return txtadress;
	}
	public WebElement getSelectstate() {
		return selectstate;
	}
	public WebElement getSelectcity() {
		return selectcity;
	}
	public WebElement getTxtzipcode() {
		return txtzipcode;
	}
	public WebElement getBtnsave() {
		return btnsave;
	}
	public WebElement getSelectpaymenttype() {
		return selectpaymenttype;
	}
	public WebElement getBtnvisa() {
		return btnvisa;
	}
	public WebElement getTxtcardno() {
		return txtcardno;
	}
	public WebElement getSelectmonth() {
		return selectmonth;
	}
	public WebElement getSelectyear() {
		return selectyear;
	}
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	public WebElement getBtnplaceorder() {
		return btnplaceorder;
	}
	public void placeorder(String firstname,String lastname,String contactno,String houseno,String adrtxt,String zipcode,String cardno,String cvv) throws InterruptedException, IOException {
		elementClick(getBtngotocart());
		elementClick(getBtnaddress());
		selectByVisibleText(getSelectaddrtype() ,"Home");
		elementSendkeys(getTxtfirstname(),firstname);
		elementSendkeys(getTxtlastname(),lastname);
		elementSendkeys(getTxtcontactno(),contactno);
		elementSendkeys(getTxthouseno(),houseno);
		elementSendkeys(getTxtadress(),adrtxt);
		selectByVisibleText(getSelectstate(), "Tamil Nadu");
		selectByVisibleText(getSelectcity(), "Tirupur");
		elementSendkeys(getTxtzipcode(),zipcode);
		elementClick(getBtnsave());
		Thread.sleep(3000);
		selectByIndex(getSelectpaymenttype(),1);
		elementClick(getBtnvisa());
		elementSendkeys(getTxtcardno() ,cardno);
		selectByIndex(getSelectmonth(),2);
		selectByIndex(getSelectyear(),2);
		elementSendkeys(getTxtcvv(),cvv);
		elementClick(getBtnplaceorder());
		String getorderid = elementGetText(btnorderid);
		  System.out.println(getorderid);
		  writeExcel("SheetName", 1, 12, getorderid);
	}
}
