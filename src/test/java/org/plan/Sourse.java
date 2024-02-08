package org.plan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sourse {
	public static void main(String[] args) {
		
		String a =("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		String b =("https://chercher.tech/practice/frames");
		
		WebDriverManager.edgedriver().setup();
		WebDriver mirror=new EdgeDriver();
		mirror.get(b);
		mirror.manage().window().maximize();
		
		 mirror.switchTo().frame("frame1");
		 WebElement element=mirror.findElement(By.xpath("//input[@type='text']"));
         element.sendKeys("vindhiya");
			
		mirror.switchTo().parentFrame();
	    mirror.findElement(By.xpath(" //*[text()='Selenium']")).click();
			
          
			
	}

}
