package org.myname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classA {
@Test
private void tc_13() {
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	//System.out.println("tc_13 test");
	}
@Test
private void tc_5() {
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.google.co.in/webhp");
	//System.out.println("tc_5 test");
	}
@Test
private void tc_2() {
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.amazon.com/");
	//System.out.println("tc_2 test");
	}
}
