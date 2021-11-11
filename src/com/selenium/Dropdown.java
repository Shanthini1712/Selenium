package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
   public static void main(String[] args) throws InterruptedException, IOException {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createacc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createacc.click();
		
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Shanthini");
		
	    WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	    lastname.sendKeys("Ramesh");
	    
	    WebElement phnum = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    phnum.sendKeys("34567901");
	    
	    WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    password.sendKeys("abcd123");
	    
		WebElement day = driver.findElement(By.id("day"));
		Select a=new Select(day);
		a.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("month"));
		Select b=new Select(month);
		b.selectByIndex(2);
		
		WebElement year = driver.findElement(By.id("year"));
		Select c=new Select(year);
		c.selectByVisibleText("2020");
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		gender.click();
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();
		
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\screenshot\\snap.png");
		FileUtils.copyFile(source,destination);
		
		
		
}
}
