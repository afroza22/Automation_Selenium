package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfrozaSelenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//afrozaparvin/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@class='_yb_xa2rq']")).click();
		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("afroza");
		//driver.getTitle();
        //driver.get("http://google.com");
       // System.out.println(driver.getTitle());
        //driver.get("http://facebook.com");
        
        
		//driver.close();
		
		driver.get("http://automationpractice.com");
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("afroza22@yahoo.com");
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("lipi06");
		driver.findElement(By.xpath("//*[contains(@class,'icon-lock left')]")).click();
		//driver.findElement(By.xpath("(//*[contains(@title,'Dresses')][5])")).click();
		//driver.findElement(By.xpath("(//*[contains(@class,'sf-with-ul')])[4])").
		//driver.findElement(By.xpath("(//*[contains(@class,'sf-with-ul')])[1]")).click();
		//driver.findElement(By.xpath("(//*[contains(@class,'sf-with-ul')])[4]")).click();
		//driver.findElement(By.xpath("(//*[contains(@class,'sf-with-ul')])[4]")).click();
		//driver.findElement(By.xpath("(//*[@class='sf-with-ul'])[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
		//driver.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/a")).click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/a")).click();
		
		
	}

}