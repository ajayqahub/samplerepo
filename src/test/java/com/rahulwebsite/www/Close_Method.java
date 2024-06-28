package com.rahulwebsite.www;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class Close_Method {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().window().maximize();
		
		String Expectedtitle = "Swag Labs";
		String ActTitle = driver.getTitle();
		System.out.print(ActTitle);
		if(Expectedtitle.equals(ActTitle)) {
			System.out.println("  is valid");
			
		}
		else {
			System.out.println("invalid");
		}
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
		
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		Dimension d = new Dimension(100, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		Point p = new Point(200, 300);
		driver.manage().window().setPosition(p);

		}
	//hello
}
