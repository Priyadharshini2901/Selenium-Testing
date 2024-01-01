package MavenProject1.TestingNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d7t3 {
        WebDriver driver;
        
        @Test
        public void atTest()
        {
           driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
//           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
//           driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).submit();
        }
        
        @BeforeTest
        public void Beforetest()
        {
        	WebDriverManager.chromedriver().setup();
        	ChromeOptions co = new ChromeOptions();
        	co.addArguments("--remote-allow-origins=*");
        	driver = new ChromeDriver(co);
        	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        	driver.manage().window().maximize();
        }
        
        @AfterTest
        public void Aftertest()
        {
        	
        }
}
