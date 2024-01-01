package Basic_Browser_Crud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Imp {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
        //implicit wait command for 10 secs
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        //getting title and comparing
        String t1 = "Purchase a Gift Certifice";
        String t2 = "";
        
        t2 = driver.getTitle();
        if(t1.equals(t2))
        {
        	System.out.print("pass");
        }
        else
        {
        	System.out.print("fail");
        }
        
        
	}

}
