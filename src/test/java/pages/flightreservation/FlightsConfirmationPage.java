package pages.flightreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AbstractPage;

public class FlightsConfirmationPage extends AbstractPage {

	public FlightsConfirmationPage(WebDriver driver) {
		super(driver);
	}

	@Override
	protected boolean isAt() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@FindBy(xpath = "//div[@class='card-body']//div[contains(normalize-space(),'Total Price ')]/div[2]/p")
	private WebElement totalPrice;
	
	

}
