package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_Robot_Windows {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement mobile = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[2]"));
	    a.contextClick(mobile).build().perform();
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement best_seller = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[3]"));
	    a.contextClick(best_seller).build().perform();
	    
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement fashion = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[4]"));
	    a.contextClick(fashion).build().perform();
	    
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String string : windowHandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
		}
	    String s="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
	    for (String mul_window : windowHandles) {
			if(driver.switchTo().window(mul_window).getTitle().equalsIgnoreCase(s)) {
				break;
		}
	    }
	    
	}

}
