package com.simplilearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;

public class FacebookAllMethod {
	public static void main(String[] args) {
		// step-1 Declare path Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\MLA Training\\chromedriver_win32\\chromedriver.exe");

		// step-2 initiate the driver
		WebDriver driver = new ChromeDriver();

		// launching facebbok
		driver.get("http://www.facebook.com/");
		//find value by id
		WebElement email1=driver.findElement(By.id("email"));
		//find value by name
		WebElement email2=driver.findElement(By.name("email"));
		
		//compare the above two 
		System.out.println("id and name found: "+email1.equals(email2));
		
		System.out.println(email1.getAttribute("placeholder"));
		
		WebElement password=driver.findElement(By.id("pass"));
		System.out.println(password.getAttribute("placeholder"));
		
		//finding element by link 
		//WebElement linktext=driver.findElement(By.linkText("Forgotten password?"));
		//linktext.click();
		
		//find the email  by using relative path
		WebElement xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		//comapare with id email
		System.out.println("id and xpath found: "+email1.equals(xpath));
		
		//find the email by using full xpath
		WebElement fullXpath=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		
		//compare
		System.out.println("fullxpath and xpath found: "+fullXpath.equals(xpath));
		
		//step:6 find email by using selector
		WebElement cssSelector= driver.findElement(By.cssSelector("#email"));
		//compare
		System.out.println("id and cssSelector Found: "+ email1.equals(cssSelector));
		
		
		//step:7 list of webelements
		
		List<WebElement> list= driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) {
			System.out.println("List of Webelements are: "+e.getAttribute("placeholder"));
		}
		
		
		//step:8 Tag and Attribute
		
		WebElement pass= driver.findElement(By.cssSelector("input[name=pass]"));
		
		System.out.println("Password using Tag: "+pass.getAttribute("placeholder"));
		
		//driver.close();
	}

}
