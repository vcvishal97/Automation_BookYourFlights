package pages.flightreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import pages.AbstractPage;

public class FlightSearchPage extends AbstractPage {

	public FlightSearchPage(WebDriver driver) {
		super(driver);
	}

	@Override
	protected boolean isAt() {
		this.wait.until(ExpectedConditions.visibilityOf(searchFlightsButton));
		return searchFlightsButton.isDisplayed();
	}

	@FindBy(xpath = "//input[@id='oneway']")
	private WebElement oneWayButton;
	
	@FindBy(id = "passengers")
	private WebElement passengersDrp;
	
	@FindBy(id = "search-flights")
	private WebElement searchFlightsButton;
	
	private Select passengersSelect;
	
	public void selectPassengers() {
		passengersSelect = new Select(passengersDrp);
		passengersSelect.selectByContainsVisibleText("One");
	}
	
	public void clickSearchFlightsButton() {
		this.searchFlightsButton.click();
	}
}
