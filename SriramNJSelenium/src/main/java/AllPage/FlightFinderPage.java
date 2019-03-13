package AllPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinderPage extends LoginPage{

	By flightFinderImg = By.xpath("//img[contains(@src,'flightfinder')]");
	By roundTripType = By.xpath("//input[@value='roundtrip']");
	By oneWayTripType = By.xpath("//input[@value='oneway']");		
	
	
	public FlightFinderPage(WebDriver driver) {
		super(driver);
		
	}

	public void validateFlightPage() {
		
		boolean SecondPage = driver.findElement(flightFinderImg).isDisplayed();
		
		if(SecondPage) {
			System.out.println("Pass");	
		}
		
	}
	

}
