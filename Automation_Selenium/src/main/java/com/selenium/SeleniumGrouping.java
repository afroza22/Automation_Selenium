package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGrouping {
	
	public static void main(String[] args) {
		
		
        System.setProperty("webdriver.chrome.driver", "//Users//afrozaparvin/Downloads/chromedriver");
		
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("http://automationpractice.com/index.phpnull");
        driver.findElement(By.xpath("(//*[contains(@class,'sf-with-ul')])[4]")).click();
        
        
        
	}

}
