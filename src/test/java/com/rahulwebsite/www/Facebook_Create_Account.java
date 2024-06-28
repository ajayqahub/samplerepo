package com.rahulwebsite.www;

import java.time.DayOfWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Create_Account {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@rel='async']")).click();
	Thread.sleep(5000);
	/*driver.findElement(By.xpath("//input[@id='u_c_b_Il']")).sendKeys("Ajay");
	Thread.sleep(5000);

	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mangichetty");
	Thread.sleep(5000);*/
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8985550819");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Ajay!!23");
	Thread.sleep(3000);
	 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	 Select s = new Select(day);
	 s.selectByVisibleText("21");
	 
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 Select m = new Select(month);
	 m.selectByIndex(0);
		Thread.sleep(3000);

	 WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	 Select y = new Select(year);
	 y.selectByValue("1991");
}
}
