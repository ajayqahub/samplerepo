package com.rahulwebsite.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsXpath {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.saucedemo.com");
	 
	 driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("problem_user");
	 driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("secret_sauce");
	 driver.findElement(By.xpath("//input[text()='button']")).click();

	 		
}
	
}
