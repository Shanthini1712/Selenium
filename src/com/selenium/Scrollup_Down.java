package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup_Down {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mobile.sendKeys("9551883324");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys("Harshu@171227");
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();*/
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1200)");
		js.executeScript("window.scroll(0,0)");
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[2]"));
		js.executeScript("arguments[0].click();", mobile);
	}

}
