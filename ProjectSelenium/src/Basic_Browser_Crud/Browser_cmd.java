package Basic_Browser_Crud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_cmd {
 public static void main(String[] args)throws InterruptedException
 {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
 //Chrome browser below 100
 //Web dr=new ChromeDriver();
 ChromeOptions co=new ChromeOptions();
 co.addArguments("-remote-allow-origins=*");
 WebDriver dr=new ChromeDriver(co);
 String url="https://www.gmail.com";
 dr.get(url);
 dr.navigate().to("https://www.facebook.com");
 Thread.sleep(5000);
 dr.navigate().back();
 Thread.sleep(3000);
 dr.manage().window().maximize();
 System.out.println(dr.getTitle());
 String curl=dr.getCurrentUrl();
 String pgsource=dr.getPageSource();
 System.out.println(pgsource);
 System.out.println(dr.getWindowHandle());
 if(curl.equals(url))
 {
	 System.out.println("both same"+ curl);
 }
 else
 {
	 System.out.println("different");
 }
 dr.close();
 }
}