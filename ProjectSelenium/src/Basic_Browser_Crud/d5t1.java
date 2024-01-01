package Basic_Browser_Crud;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class d5t1 {

	public static void main(String[] args) {
		
		   ChromeOptions co = new ChromeOptions();
		   co.addArguments("--remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(co);
		   driver.get("https://j2store.net/free/");
		   driver.manage().window().maximize();
		   
		   String ob = driver.getTitle();
		   if(ob.equals("Home"))
		   {
			   System.out.println("found");
		   }
		   else
		   {
			   System.out.println("not found");
		   }
		   
		   driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		   if(driver.getTitle().equals("Shop"))
		   {
			   System.out.println("yes");
		   }
		   else
		   {
			   System.out.println("no");
		   }
		// TODO Auto-generated method stub
//		   ChromeOptions co = new ChromeOptions();
//	       co.addArguments("--remote-allow-origins=*");
//	       WebDriver driver = new ChromeDriver(co);
//	       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
//	       driver.manage().window().maximize();
//			driver.get("https://j2store.net/free/");
//			System.out.println("Task 01");
//			System.out.println();
//			//task 01
//			System.out.println("Validate the Title");
//			System.out.println();
//	        String ob=driver.getTitle();
//	        if(ob.equals("Home"))
//	        {
//	        	System.out.println("The title of the page is Home");
//	        }
//	        else
//	        {
//	        	System.out.println("The title of the page is not Home");
//	        }
//	        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
//	        if(driver.getTitle().equals("Shop"))
//	        {
//	        	System.out.println("The title of the page is Shop");
//	        }
//	        
//	        System.out.println();
//	        System.out.println("Getting back to Home page for next Task");
//	        System.out.println();
//	        
//	        
//	        driver.navigate().back();

	}

}
