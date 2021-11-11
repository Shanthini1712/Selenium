package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Shanthini\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
			driver.manage().window().maximize();
			
			//isMultiple
			
			WebElement multi = driver.findElement(By.id("multi-select"));
			Select s=new Select(multi);
			boolean multiple=s.isMultiple();
			System.out.println("To Check Multiple:"+multiple);
			
			//getoption
			List<WebElement> options = s.getOptions();
			for(WebElement webElement:options) {
				String text = webElement.getText();
				System.out.println("To get Option:" +text);
			}
			//to get size
			int size = options.size();
			System.out.println("To print Size:" +size);
			
			//select by index
			for(int i=0;i<size;i++) {
				if(i==0||i==3||i==7) {
					s.selectByIndex(i);
			
				}
			}
				List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
				for(WebElement webElement1:allSelectedOptions) {
					String text1 = webElement1.getText();
					System.out.println("To print selected item:" +text1);
				}
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				String text2 = firstSelectedOption.getText();
				System.out.println("To get first selected item:"+text2);
				
				
			}
			
	}
	


