package Basic_Browser_Crud;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class d6t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("priya");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("priya@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("pri@!$$rtir123456");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("S S");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("0", "10000");
		WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"load_flatpickr\"]"));
		datepicker.click();                                  
		
		WebElement month = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/select/option[2]"));
		
		month.click();
		WebElement year = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/input"));
		year.click();                                 
		year.sendKeys("2004");
		WebElement date = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[12]"));
		date.click();
		
		driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]")).sendKeys("9808910098");
		driver.findElement(By.xpath("//*[@id=\"phone_1665627865\"]")).sendKeys("8789978390");
        
		WebElement country = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[2]/div[2]/div[2]/div/select"));
		country.click();
		Select selects = new Select(country);
		selects.selectByVisibleText("India");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(0,1000","");
		
		WebElement doa = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[3]/div/div[1]/div/span/input[1]"));
		doa.click();                                  
		
		WebElement dom = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[26]"));
		dom.click();
		
//		WebElement doy = driver.findElement(By.xpath(""));
//		doy.click();
		
		driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("2");
		
		WebElement days = driver.findElement(By.xpath(""));
		days.sendKeys("5 and 1");
		
		//Alert obj = driver.switchTo.alert();
		//obj.accept();
		//obj.dismiss();
	
     	driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_1665628131_Nut Allergy\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
	    //WebElement j = driver.m,;
		//print(j);
		
		
	}

}
