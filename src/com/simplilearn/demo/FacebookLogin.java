package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) {
	// step-1 Declare path Driver
			String path="C:\\Users\\user\\Desktop\\MLA Training\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			
			//step-2 initiate the driver
			WebDriver driver=new ChromeDriver();
			
			//step-3 set up the base url
			String base_url="http://www.facebook.com/";
			
			//launching facebbok
			driver.get(base_url);
			
			// finding webelement from webpages
			WebElement email= driver.findElement(By.id("email"));
			System.out.println(email.getAttribute("placeholder"));
			
			WebElement password=driver.findElement(By.id("pass"));
			System.out.println(password.getAttribute("placeholder"));
		
			//sending data to the element we have found
			email.sendKeys("alok@gmail.com");
			password.sendKeys("Alok@123");
			
			// there is no id for login instead we have name 
			WebElement login =driver.findElement(By.name("login"));
			login.click();
			//driver.close();
			
			
}

}
