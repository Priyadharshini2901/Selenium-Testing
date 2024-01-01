package Basic_Browser_Crud;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class d5t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
	       co.addArguments("--remote-allow-origins=*");
	       WebDriver driver = new ChromeDriver(co);
	       
	       driver.manage().window().maximize();
		   driver.get("https://j2store.net/free/");
	       if(driver.getCurrentUrl().equals("https://j2store.net/free/"));
	       {
	    	   System.out.print("yesss");
	       }
//	       JavascriptExecutor js = (JavascriptExecutor) driver;
//	       js.executeScript("windows.scrollBy(0,1000)", "");
		   driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
		   if(driver.getCurrentUrl().equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		   {
			   System.out.print("yes");
		   }
		   else
		   {
			   System.out.print("no");
		   }
		   
		   
		   
		   
		   

	        
	}

}
