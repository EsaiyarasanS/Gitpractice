package org.myname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynaxpath extends BaseClass {
	public static void main(String[] args) {
		browserLaunch();
		driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		WebElement name = driver.findElement(By.xpath("//th[text()='Name']"));
		System.out.println(name.getText());
		List<WebElement> name1= driver.findElements(By.xpath("//th[text()='Name']//parent::th//following::tr//td[1]"));
	
		List<WebElement> age = driver.findElements(By.xpath("//th[text()='Name']//parent::th//following::tr//td[4]"));
		for (int i = 0; i < name1.size(); i++) {	
			String text = name1.get(i).getText();
			String text1= age.get(i).getText();
		
		System.out.println(text+"  "+text1 );
		}
		
		
		driver.close();
}
}