package com.simplilearn.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogletitleCheck {
	public static void main(String[] args) {
		// step-1 declair the driverd path
		String path = "C:\\\\Users\\\\user\\\\Desktop\\\\MLA Training\\\\chromedriver_win32\\\\chromedriver.exe";

		// step-2 set system property
		System.setProperty("webdriver.chrome.driver", path);
		
		// step-3 initialize the driver
		WebDriver driver = new ChromeDriver();

		// step-4 set the base url
		String base_url = "http://www.google.com/";

		// step-5 launching google chrome
		driver.get(base_url);
		
		//step-6 testing for google title 
		String expectedTitle="Google";
		String actualTitle="";
		actualTitle=driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("test passed with title :" + "  "+driver.getTitle());
		}else {
			System.out.println("test failed");
		}
		
		driver.close();

	}

}
