package pages.flightreservation;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AbstractPage;

public class SelectFlightsPage extends AbstractPage {

	public SelectFlightsPage(WebDriver driver) {
		super(driver);
	}

	@Override
	protected boolean isAt() {
		this.wait.until(ExpectedConditions.visibilityOf(confirmFlightsButton));
		return this.confirmFlightsButton.isDisplayed();
	}

	@FindBy(xpath = "//button[contains(normalize-space(),'Confirm Flights')]")
	private WebElement confirmFlightsButton;
	
	@FindBy(name = "departure-flight")
	private List<WebElement> departureFlightOptions;
	
	@FindBy(name = "arrival-flight")
	private List<WebElement> arrivalFlightOptions;
	
	public void selectArrivalFlights() {
		int random = ThreadLocalRandom.current().nextInt(0, arrivalFlightOptions.size());
		this.arrivalFlightOptions.get(random).click();
	}
	
	public void selectDepartureFlights() {
		int random = ThreadLocalRandom.current().nextInt(0, departureFlightOptions.size());
		this.departureFlightOptions.get(random).click();
	}
	
	public void clickConfirmFlightsButton() {
		this.confirmFlightsButton.click();
	}
	
}
