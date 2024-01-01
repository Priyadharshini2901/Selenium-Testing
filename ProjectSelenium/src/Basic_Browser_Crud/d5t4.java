package Basic_Browser_Crud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class d5t4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		
//      driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("priya@gmail.com");
//      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("priya@1234");
//      driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		
		
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
	}
	
}
