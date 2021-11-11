package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("Harshu");
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		Thread.sleep(3000);
		 driver.switchTo().frame(1);
		 driver.switchTo().frame(0);
		 
		 WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 text1.sendKeys("Harshu");
		
		
	}

}
