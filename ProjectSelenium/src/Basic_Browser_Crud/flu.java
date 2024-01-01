package Basic_Browser_Crud;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class flu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,1000)","");
		//fluent wait
		
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMinutes(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		//firstname
		driver.findElement(By.id("input-to-name")).sendKeys("Hey");
	}

}
