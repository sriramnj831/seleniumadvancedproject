package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;



public class GoogleTest {

	WebDriver driver;
	
//	@Test(priority=0)
//  public void yahooLogin() throws InterruptedException {
//	  
//	 driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("name@yahoo.in"); 
//	 driver.findElement(By.xpath("//input[@id='login-signin']")).click();
//	 driver.getTitle();
//	 Assert.assertEquals("Yahoo","Yahoo");
//	 Thread.sleep(5000);
//	 WebElement notYouLink = driver.findElement(By.xpath("//p[@class='not-you']//a[contains(text(),'Not')]"));
//	 
//	 Actions builder = new Actions(driver);
//	 builder.clickAndHold(notYouLink).release(notYouLink);
//	 builder.build().perform();
//	}
	
//	@Test(priority=1)
//	public void testMeAppLogin() {
//		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("lalitha");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Assert.assertEquals("Home", driver.getTitle());
//	}	
//	@Test(priority=2)	
//	public void testMeAppCartValidation() {	
//	
//		WebElement allCatlnk = driver.findElement(By.xpath("//a//span[contains(text(),'All Categories')]"));
//		WebElement electronicslnk = driver.findElement(By.xpath("//a//span[contains(text(),'Electronics')]"));
//		WebElement headPhonelnk = driver.findElement(By.xpath("//a//span[contains(text(),'Head Phone')]"));
//		Actions act = new Actions(driver);
//		act.moveToElement(allCatlnk).click().build().perform();
//		act.moveToElement(electronicslnk).click().build().perform();
//		act.moveToElement(headPhonelnk).click().build().perform();
//		
//		WebDriverWait waitTime = new WebDriverWait(driver, 10);
//		WebElement addtoCart = waitTime.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),' Add to cart')]")));
//		act.moveToElement(addtoCart).click().build().perform();
//	
//		WebElement cartlnk = driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
//		waitTime.until(ExpectedConditions.textToBePresentInElementValue(cartlnk, "1"));
//		
//	}
		
	@Test(priority=0)
	public void excelDownloadRobot() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath(".//a[@href=contains(text(),'mailmerge.xls')]")).click();            
		          Robot robot = new Robot();            
		          Thread.sleep(2000); // Thread.sleep throws InterruptedException    
		          robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button               
		          Thread.sleep(2000);  
		          robot.keyPress(KeyEvent.VK_TAB);      
		          Thread.sleep(2000);    
		          robot.keyPress(KeyEvent.VK_TAB);      
		          Thread.sleep(2000);    
		          robot.keyPress(KeyEvent.VK_TAB);      
		          Thread.sleep(2000);    
		          robot.keyPress(KeyEvent.VK_ENTER); 
		  }
		

//  @BeforeClass
//  public void launchPage() {
//	  
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.12\\chromedriver.exe");
//	  driver = new ChromeDriver();
////	  driver.get("https://login.yahoo.com/");
//	  driver.get("http://10.232.237.143:443/TestMeApp");
//	  driver.manage().window().maximize();
//		
//  }
  
  @BeforeClass
  public void launchExcel() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\training_c2d.02.12\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
	  
	  
	  
  }
  

  

  @AfterClass
  public void closeBrowser() {
	  
	  driver.quit();
  }

}
