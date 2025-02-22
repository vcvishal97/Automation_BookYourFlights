package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
	
	protected final WebDriver driver;
	protected WebDriverWait wait;
	protected final int waitDurationInSeconds = 30;
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(waitDurationInSeconds));
		PageFactory.initElements(driver, this);
	}
	
	protected abstract boolean isAt();
}
