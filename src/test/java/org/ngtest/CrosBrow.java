package org.ngtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrosBrow {
 WebDriver driver;
 @Parameters("browser")
 @Test
 private void login(String browsername) throws InterruptedException {
	
	if (browsername.equals("chrome")) {
		driver=new ChromeDriver();
		
	} else if(browsername.equals("edge")){
		driver=new EdgeDriver();
	}
	 Thread.sleep(3000);
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("crossbrowser");
 }
 
}
