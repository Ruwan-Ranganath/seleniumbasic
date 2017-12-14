package TestAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;

public class TestNGFacebook {

	public WebDriver driver;

  @Test

  public void main() throws InterruptedException {
	  
	  String facebookurl = "https://www.facebook.com";
		
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("Facebook");
		
		driver.findElement(By.name("btnK")).submit();
		
		// wait until the google page shows the result
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		
			
		if(driver.getPageSource().contains(facebookurl))
		{
		    System.out.println(facebookurl+" is there with us");
		   		    		 
		    //driver.findElement(By.xpath("//*[contains(@href,'https://www.facebook.com/login')]")).click();
		    driver.findElement(By.xpath(""));
		    
		    
		   // Name  Will Albcdcgfehhfi Bowersson
		   // User ID	100023437658869
		   // Login email	lgtlghc_bowersson_1513059230@tfbnw.net
		   /// Login password	xmr31rgs4c0
		    
		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    driver.findElement(By.id("email")).sendKeys("lgtlghc_bowersson_1513059230@tfbnw.net");
		    driver.findElement(By.id("pass")).sendKeys("xmr31rgs4c0");
		    
		    driver.findElement(By.id("u_0_2")).submit();	
		    
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    if(driver.getTitle().equals("Facebook")&& driver.getCurrentUrl().equals("https://www.facebook.com/"))
		    {
		    	System.out.println("Successfully Logged into Facebook");
		    }
		    else
		    {
		    	System.out.println("Not logged into Facebook");
		    	Thread.sleep(5000);
		    }
		   
		}

		else
		{
			System.out.println(facebookurl+"is NOT with us");
			//driver.quit();
		}
	
	  
  }

  @BeforeMethod

  public void beforeMethod() {
	  
	  // Adding Gecko Driver for Selenium 3 or higher
	  System.setProperty("webdriver.gecko.driver","/home/rubi/DevSpace/devlopment/qa/geckodriver");

	  // Create a new instance of the Firefox driver
      driver = new FirefoxDriver();

      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      //Launch the google.lk
      driver.get("http://www.google.lk");

  }

  @AfterMethod

  public void afterMethod() {

	  // Close the driver

     // driver.quit();

  }

}