package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?src=ym&done=https%3A%2F%2Fmail.yahoo.com%2F&add=1");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Shanthini");
		WebElement createacc = driver.findElement(By.xpath("//a[@id='createacc']"));
		createacc.click();
		WebElement fname = driver.findElement(By.xpath("//input[@id='usernamereg-firstName']"));
		fname.sendKeys("Shanthini");
		WebElement lname = driver.findElement(By.xpath("//input[@id='usernamereg-lastName']"));
		lname.sendKeys("Ramesh");
		WebElement emailadd = driver.findElement(By.xpath("//input[@id='usernamereg-yid']"));
		emailadd.sendKeys("shaanthini92");
		WebElement password = driver.findElement(By.xpath("//input[@id='usernamereg-password']"));
		password.sendKeys("12345");
		WebElement phnum = driver.findElement(By.xpath("//input[@id='usernamereg-phone']"));
		phnum.sendKeys("6789012345");
		Thread.sleep(3000);
		//WebElement gender = driver.findElement(By.xpath("//div[@id=\"gender-container\"]"));
		//gender.sendKeys("Female");
		Thread.sleep(3000);
		WebElement signup = driver.findElement(By.xpath("//button[@name='signup']"));
		signup.click();
	}

}
