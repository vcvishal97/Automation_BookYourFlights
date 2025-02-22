package pages.flightreservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AbstractPage;

public class RegistrationPage extends AbstractPage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	protected boolean isAt() {
		this.wait.until(ExpectedConditions.visibilityOf(this.registerButton));
		return this.registerButton.isDisplayed();
	}
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "street")
	private WebElement street;
	
	@FindBy(name = "city")
	private WebElement city;
	
	@FindBy(name = "zip")
	private WebElement zip;
	
	@FindBy(xpath = "//button[normalize-space()='Register']")
	private WebElement registerButton;
	
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void setStreet(String street) {
		this.street.sendKeys(street);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public void setZip(String zip) {
		this.zip.sendKeys(zip);
	}

	public void clickRegisterButton(WebElement registerButton) {
		this.registerButton.click();
	}

}
