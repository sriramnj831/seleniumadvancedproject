package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JavaScript {
	
	WebDriver driver;
	
  @Test(enabled = false)
  public void javaScriptTamilOne() {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  String titleName = js.executeScript("return document.title;").toString();
	  System.out.println(titleName);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\training_c2d.02.12\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.javatpoint.com/");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
