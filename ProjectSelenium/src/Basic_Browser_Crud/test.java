package Basic_Browser_Crud;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
          ChromeOptions co = new ChromeOptions();
          co.addArguments("--remote-allow-origins=*");
          WebDriver driver = new ChromeDriver(co);
          driver.get("https://www.google.com/");
          driver.manage().window().maximize();
//          
          driver.findElement(By.className("gLFyf")).sendKeys("Hello");
          driver.findElement(By.className("gNO89b")).submit();
          driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]"));
          driver.findElement(By.xpath("//input[contains(@value,\"Google Search\")]")).submit();
          driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
	}

}
