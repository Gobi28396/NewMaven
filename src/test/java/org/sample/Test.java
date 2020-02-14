package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Firstpro\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
	
}
}