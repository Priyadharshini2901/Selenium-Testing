package com.test.project;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHelloWorld {
    WebDriver driver;
	@Test
	public void facebook()
	{
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\'loginbuttton\']")).click();
	}
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(co);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@AfterTest
	public void aftertest()
	{
		
	}
	
}
