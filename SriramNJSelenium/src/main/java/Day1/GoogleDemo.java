package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.12\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.yahoo.com/");
//		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("name@yahoo.in");
//		driver.findElement(By.xpath("//input[@id='login-username']")).submit();
		
		driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resizeBtn = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(resizeBtn, 500, 200).perform();
		
		driver.quit();
	}

}
