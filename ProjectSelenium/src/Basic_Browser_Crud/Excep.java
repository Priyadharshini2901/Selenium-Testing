package Basic_Browser_Crud;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		try
		{
			driver.findElement(By.className("form-check-inp")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.print("Element Not Found sorry");
		}
	}

}
