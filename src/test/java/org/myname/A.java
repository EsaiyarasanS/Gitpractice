package org.myname;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A extends BaseClass{
  static WebDriver driver;
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
  public  void booking() throws IOException, InterruptedException {
	  WebElement belogin = findLbyXpath("//button[@type='submit']");
	  belogin.getAttribute("value");
	  WebElement element = findLocatorById("email");
	  elementSendkeys(element,readExcelData("SheetName", 1, 0));
	  WebElement pass = findLocatorById("pass");
	  elementSendkeys(pass,readExcelData("SheetName", 1, 1));
	  WebElement login = findLbyXpath("//button[@value='login']");
	  elementClick(login);
	  WebElement searchhere = findLocatorById("search");
	  elementSendkeys(searchhere,readExcelData("SheetName", 1, 2));
	  WebElement search = findLbyXpath("//i[@class='fa fa-search colorWhite']");
	  elementClick(search);
	  WebElement add = findLbyXpath("//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-17']");
	  elementClick(add);
	  WebElement addcart = findLocatorById("cart-21");
	  elementClick(addcart);
	  Thread.sleep(5000);
	  WebElement go = findLbyXpath("//a[text()=' Go To Cart ']");
	  elementClick(go);
	  WebElement adress = findLbyXpath("//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']");
	  elementClick(adress);
	  WebElement selectaddr = findLbyXpath("//select[@name='address_type']");
	  selectByVisibleText(selectaddr, "Home");
	  WebElement fname = findLbyXpath("//input[@placeholder='First name*']");
	  elementSendkeys(fname ,readExcelData("SheetName", 1, 4));
	  WebElement Lname = findLbyXpath("//input[@placeholder='Last name*']");
	  elementSendkeys(Lname ,readExcelData("SheetName", 1, 5));
	  WebElement cno = findLbyXpath("//input[@placeholder='Contact No*']");
	  elementSendkeys(cno ,readExcelData("SheetName", 1, 6));
	  WebElement hno = findLbyXpath("//input[@placeholder='House No*']");
	  elementSendkeys(hno ,readExcelData("SheetName", 1, 7));
	  WebElement addr = findLbyXpath("//input[@placeholder='Address*']");
	  elementSendkeys(addr ,readExcelData("SheetName", 1, 8));
	  WebElement state = findLbyXpath("//select[@name='state']");
	  selectByVisibleText(state, "Tamil Nadu");
	  WebElement city = findLbyXpath("//select[@name='city']");
	  selectByVisibleText( city, "Tirupur");
	  WebElement zipcode = findLbyXpath("//input[@name='zipcode']");
	  elementSendkeys(zipcode ,readExcelData("SheetName", 1, 9));
	  WebElement save = findLbyXpath("//button[@class='saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']");
	  elementClick(save);
	  Thread.sleep(5000);
	  WebElement payment = findLocatorById("payment_type");
	  selectByIndex(payment, 1);
	  WebElement visa = findLbyXpath("//label[text()=' Visa ']");
	  elementClick(visa );
	  WebElement cardno = findLbyXpath("//input[@class='form-control mt-2']");
	  elementSendkeys(cardno ,readExcelData("SheetName", 1, 10));
	  WebElement month = findLocatorById("month");
	  selectByIndex(month, 2);
	  WebElement year = findLocatorById("year");
	  selectByIndex(year, 2);
	  WebElement cvv = findLbyXpath("//input[@placeholder='CVV']");
	  elementSendkeys(cvv ,readExcelData("SheetName", 1, 11));
	  WebElement placeorder = findLocatorById("placeOrder");
	  elementClick(placeorder);
	  WebElement orderid = findLbyXpath("//p[@class='font18 color20 fontSemiBold mb-0']");
	  String text = orderid.getText();
	  System.out.println(text);
	WebElement orderid1 = findLbyXpath("//p[@class='font18 color20 fontSemiBold mb-0']");
	 takesScreenshotElement(orderid ,"orderid") ;
	 writeExcel("SheetName", 2, 4, text);
     
	  
	  
  }
}