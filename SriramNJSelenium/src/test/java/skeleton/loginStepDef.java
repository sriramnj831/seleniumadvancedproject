package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AllPage.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDef {

	
	WebDriver driver;
	
	@Given("^User is in Home Page$")
	public void user_is_in_Home_Page() throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.12\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demoaut.com");
		  driver.manage().window().maximize();
	  
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" & clicks Submit button$")
	public void user_enters_and_clicks_Submit_button(String arg1, String arg2) throws Throwable  {
		LoginPage login = new LoginPage(driver);
		  login.loginPageTitle();
		  login.login(arg1, arg2);
		  
		
	}

	@Then("^Login is successful$")
	public void login_is_successful() throws Throwable {
		driver.quit();
		System.out.println("Login successful");
	    
	}

	
	
}
