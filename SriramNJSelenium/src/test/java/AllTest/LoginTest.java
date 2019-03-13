package AllTest;

import org.testng.annotations.Test;

import AllPage.LoginPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
	WebDriver driver;
	
	
	
  @Test(dataProvider = "DataTest", dataProviderClass = AllPage.ExcelReadandWrite.class )
  public void validateLogin(String username, String password) {
	
	  LoginPage login = new LoginPage(driver);
	  login.loginPageTitle();
	  login.login(username, password);
	  
  }
  @BeforeClass
  public void beforeClass() {
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.12\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demoaut.com");
	  driver.manage().window().maximize();
  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
