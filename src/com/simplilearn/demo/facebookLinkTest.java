package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLinkTest {
	public static void main(String[] args) {
		// step-1 Declare path Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\MLA Training\\chromedriver_win32\\chromedriver.exe");

		// step-2 initiate the driver
		WebDriver driver = new ChromeDriver();

		// launching facebbok
		driver.get("http://www.facebook.com/");
		
		WebElement linktext=driver.findElement(By.linkText("Forgotten password?"));
		linktext.click();
	}

}
