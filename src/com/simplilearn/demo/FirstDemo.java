package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
	public static void main(String[] args) {
		// step-1 Declare path Driver
		String path="C:\\Users\\user\\Desktop\\MLA Training\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//step-2 initiate the driver
		WebDriver driver=new ChromeDriver();
		
		//step-3 set up the base url
		String base_url="http://www.google.com/";
		
		//launching base url
		driver.get(base_url);
		
		driver.close();
		
	}

}
