package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class facebookautomation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/rubi/DevSpace/devlopment/qa/geckodriver");
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.google.lk");
		
		String facebookurl = "https://www.facebook.com";
		
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys(facebookurl);
		
		driver.findElement(By.name("btnK")).submit();
		
		// wait until the google page shows the result
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		
			
		if(driver.getPageSource().contains(facebookurl))
		{
		    System.out.println(facebookurl+" is there with us");
		    driver.findElement(By.xpath("//*[contains(@href,'https://www.facebook.com/')]")).click();
		    
		    
		   // Name  Will Albcdcgfehhfi Bowersson
		   // User ID	100023437658869
		   // Login email	lgtlghc_bowersson_1513059230@tfbnw.net
		   /// Login password	xmr31rgs4c0
		    
		    
		    Thread.sleep(10000);
		    
		    driver.findElement(By.id("email")).sendKeys("lgtlghc_bowersson_1513059230@tfbnw.net");
		    driver.findElement(By.id("pass")).sendKeys("xmr31rgs4c0");
		    
		    driver.findElement(By.id("u_0_2")).submit();	

		   
		}

		else
		{
			System.out.println(facebookurl+"is NOT with us");
			driver.quit();
		}
	
				
		//driver.findElement(By.linkText("Facebook - Log In or Sign Up")).click();
		
        // Print a Log In message to the screen
        System.out.println("Going Down");
 

	}

}
