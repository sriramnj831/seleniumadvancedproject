package AllPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By userName = By.name("userName");
	By password = By.name("password");
	By signIn = By.name("login");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	
	}

	public void loginPageTitle() {
		
		driver.getTitle();		
		
	}
	
	public void login(String username, String passwd) {
		
		driver.findElement(userName).sendKeys(username);
		driver.findElement(password).sendKeys(passwd);
		driver.findElement(signIn).click();
		
	}
	
	
	
}
