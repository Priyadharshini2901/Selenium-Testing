package Basic_Browser_Crud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ce2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-workspace\\ProjectSelenium\\driver\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		driver.manage().window().maximize();
		//firstname
				driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Vasanth");
				//Email
				driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("vaaasah7342@gmail.com");
				//password
				//driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Vasant9hh@12345");
				driver.findElement(By.cssSelector("input[type='password'][id='user_pass']")).sendKeys("Vwasant9hh@12345");
				//Lastname
				driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("A");
				//Gender
				driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
				//nationality
				driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
				//date picker
				WebElement datepicker=driver.findElement(By.xpath("//*[@id=\"load_flatpickr\"]"));
				datepicker.click();
				//month
				WebElement month=driver.findElement(By.xpath("//option[text()='February']"));
				month.click();
				
				//year
				WebElement year=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));
				year.click();
				year.sendKeys("1999");
				//date
				WebElement date=driver.findElement(By.xpath("//span[text()='21']"));
				date.click();	
				
				//PhoneNumber
			driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[2]/div[1]/div[2]/p/input")).sendKeys("1234567890");
				
				//Emergency contact
			driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[2]/div[1]/div[3]/p/input")).sendKeys("9874563210");
			
				//country
				WebElement country=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[2]/div[2]/div[2]/div/select"));
				country.click();
				Select select =new Select(country);
				select.selectByVisibleText("India");
			
				//JavaScript executor scrollBy
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,1000)", "");
				//date of arrival date picker
				WebElement doa=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[3]/div/div[1]/div/span/input[1]"));
				doa.click();
				//month
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				
				//date for doa;
			   WebElement doadate =driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[26]"));
			   doadate.click();
			   //stay duration
			  driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("5");
			   //room and bed nos;
			   WebElement room =driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]"));
			   room.sendKeys("5 rooms 10 beds");
			   //occupation and place of employeement;
			   WebElement occupation=driver.findElement(By.xpath("//*[@id=\"textarea_1665630078\"]"));
			   occupation.sendKeys("freelancer at SKCT college");
			   //parking
			   WebElement parking=driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]"));
			   parking.click();
			   //room selection
			   WebElement selection=driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Shared Room\"]"));
			   selection.click();
			  //dietry restriction
			   WebElement dietryRestriction=driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]"));
			   dietryRestriction.click();
			 //JavaScript executor scrollBy
			 		JavascriptExecutor js1 =(JavascriptExecutor)driver;
			 		js1.executeScript("window.scrollBy(0,1000)", "");
			   //Activitites attending 
			   WebElement activities=driver.findElement(By.xpath("//*[@id=\"select_1665628361\"]"));
			   activities.click();
			   Select activites= new Select(activities);
			   activites.selectByVisibleText("Town Hall");
			   //terms and condtion 
			   WebElement terms=driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]"));
			   terms.click();
			   Thread.sleep(5000);
			   //Submitting the form
			   WebElement submit =driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button/span"));
			    submit.submit();
			   //verify login
			    WebElement msg=driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]/ul"));
			    String actualtext=msg.getText();
			    System.out.println(actualtext);
			    String expectedText="User successfully registered.";
			    System.out.println(actualtext.equals(expectedText));
			    
			    driver.quit();
				
	}

}
