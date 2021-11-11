package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//simple
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple.click();
		
		Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		
		
		//confirm
		WebElement conf = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		conf.click();
		
		WebElement confclk = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confclk.click();
		driver.switchTo().alert().dismiss();
		
		//promt
		WebElement pmt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		pmt.click();
		
		WebElement pmtclk = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		pmtclk.click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("Shanthini");
		
		driver.switchTo().alert().accept();
		
		
		
		
	}
}
