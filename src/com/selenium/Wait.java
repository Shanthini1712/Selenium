package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   WebElement create_acc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	   create_acc.click();
	   
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   
	   WebElement fname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[2]")));	   	  
	   fname.sendKeys("Harshu");
}
}
