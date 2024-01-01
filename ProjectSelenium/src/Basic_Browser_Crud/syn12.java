package Basic_Browser_Crud;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class syn12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		

		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Priya");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S S");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("priya@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("priya1234");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)","");
//		
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).submit();
		
	}

}
