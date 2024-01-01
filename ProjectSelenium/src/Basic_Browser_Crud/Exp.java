package Basic_Browser_Crud;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://www.google.com");
        driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement re = wait.until(ExpectedConditions.elementToBeClickable(By.className("NO89b")));
        driver.findElement(By.className("NO89b")).submit();
	}

}
