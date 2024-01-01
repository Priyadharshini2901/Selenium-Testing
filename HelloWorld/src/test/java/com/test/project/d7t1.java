package com.test.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d7t1 {

	
		// TODO Auto-generated method stub
		 WebDriver driver;
			@Test
			public void facebook()
			{
				String ob = driver.getTitle();
				
				System.out.print(ob);
//				if(ob.equals("Guest"))
//				{
//					System.out.print("yes");
//				}
//				else
//				{
//					System.out.print("no");
//				}
			}
			
			@BeforeTest
			public void beforetest()
			{
				WebDriverManager.chromedriver().setup();
				ChromeOptions co =new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				driver= new ChromeDriver(co);
				driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
				driver.manage().window().maximize();
			}
			@AfterTest
			public void aftertest()
			{
				
			}
	

}
