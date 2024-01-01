package Basic_Browser_Crud;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ce1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)","");
        
        driver.findElement(By.id("input-firstname")).sendKeys("priya");
        driver.findElement(By.id("input-lastname")).sendKeys("hi");
        driver.findElement(By.id("input-email")).sendKeys("priya@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("priya@123");
        
        Thread.sleep(5000);
        driver.close();        
        
        
	}
}
