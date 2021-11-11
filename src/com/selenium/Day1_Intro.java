package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Intro {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.navigate().to("https://login.yahoo.com/?src=ym&done=https%3A%2F%2Fmail.yahoo.com%2F&add=1");
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    String title = driver.getTitle();
    System.out.println(title);
    //String pageSource = driver.getPageSource();
    //System.out.println(pageSource);
    WebElement username = driver.findElement(By.id("login-username"));
    username.sendKeys("shanu@yahoo.in");
    Thread.sleep(5000);
    WebElement createacc = driver.findElement(By.id("createacc"));
    createacc.click();
    WebElement firstname = driver.findElement(By.id("usernamereg-firstName"));
    firstname.sendKeys("Harshu");
    WebElement lastname = driver.findElement(By.id("usernamereg-lastName"));
    lastname.sendKeys("Ramesh");
    WebElement email = driver.findElement(By.id("usernamereg-yid"));
    email.sendKeys("Harshu@yahoo.in");
    WebElement password = driver.findElement(By.id("usernamereg-password"));
     password.sendKeys("12345");
     //WebElement gender = driver.findElement(By.id("gender-container"));
     //gender.sendKeys("Male");
     Thread.sleep(5000);
     WebElement signup = driver.findElement(By.name("signup"));
     signup.click();
     
	}
	
}
