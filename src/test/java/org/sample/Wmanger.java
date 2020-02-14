package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wmanger {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement f = d.findElement(By.id("email"));
		f.sendKeys("gobinyahu");

		WebElement f1= d.findElement(By.id("pass"));
		f1
		.sendKeys("gobinyahuth");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
