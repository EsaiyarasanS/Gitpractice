package org.myname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		browserLaunch();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2F&reauth=1");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		WebElement lb = driver.findElement(By.xpath("//div[text()='Job Board']"));
		Actions action=new Actions(driver);
		action.moveToElement(lb).perform();
		WebElement app = driver.findElement(By.xpath("//a[text()='Applications ']"));
		app.click();
		WebElement a = driver.findElement(By.xpath("//a[text()='Web Editor']//parent::td//preceding-sibling::td//strong"));
	     System.out.println(a.getText());
	     List<WebElement> b = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding-sibling::td"));
	      for (int i = 0; i < b.size(); i++) {
	    	  System.out.println(b.get(i).getText());
			
		}          
	    
		     List<WebElement> c = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding::td"));
		      for (int i = 0; i < c.size(); i++) {
		    	  System.out.println(c.get(i).getText());
				
			}     
		      List<WebElement> d = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//following::td"));
		      for (int i = 0; i < d.size(); i++) {
		    	  System.out.println(d.get(i).getText());
				
			}   
		      List<WebElement> e = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//following-sibling::td"));
		      for (int i = 0; i < e.size(); i++) {
		    	  System.out.println(e.get(i).getText());
				
			}        
		      List<WebElement> f = driver.findElements(By.xpath("//a[text()='Web Editor']//ancestor::tr//following-sibling::tr"));
		      for (int i = 0; i < f.size(); i++) {
		    	  System.out.println(f.get(i).getText());
				
			}      
		      
	      
	}
		
	}
