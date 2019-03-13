package AllTest;

import org.testng.annotations.Test;

import AllPage.LoginPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class PageFactoryLoginTest {
	
	WebDriver driver;

	LoginPage login = PageFactory.initElements(driver, LoginPage.class); 
	
	
	
  @Test
  public void validateLogin() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
