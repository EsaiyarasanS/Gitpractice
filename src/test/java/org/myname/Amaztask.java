package org.myname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Amaztask extends BaseClass {
	public static void main(String[] args) {
		browserLaunch();
		driver.get("https://www.amazon.in/");
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")); 
		name.sendKeys("apple iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> iphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']//following::a//span//span[2]//span[2]"));
		for (int i = 0; i < iphone.size(); i++) {
			String text = iphone.get(i).getText();
			String text2 = price.get(i).getText();
			System.out.println(text+" = "+text2);
		}
		
		
		
		
		
driver.close();
}
}
