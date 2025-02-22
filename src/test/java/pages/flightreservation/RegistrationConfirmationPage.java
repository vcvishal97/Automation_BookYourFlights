package pages.flightreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AbstractPage;

public class RegistrationConfirmationPage extends AbstractPage {

	public RegistrationConfirmationPage(WebDriver driver) {
		super(driver);
	}

	@Override
	protected boolean isAt() {
		this.wait.until(ExpectedConditions.visibilityOf(this.goToFlightsSearchButton));
		return goToFlightsSearchButton.isDisplayed();
	}
	
	@FindBy(xpath = "//h2[contains(normalize-space(),'Registration Confirm')]")
	private WebElement confirmationDialogue;
	
	@FindBy(xpath = "//a[contains(normalize-space(),'Go To Flights Search')]")
	private WebElement goToFlightsSearchButton;
	
	public void clickGoToFlightsSearchButton() {
		this.goToFlightsSearchButton.click();
	}
	
}
