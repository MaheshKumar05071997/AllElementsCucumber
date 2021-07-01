package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CountrySuggestion {

	public WebDriver driver;

	public CountrySuggestion(WebDriver driver) {
		this.driver = driver;
	}

	By countryTextField = By.xpath("//input[@placeholder='Type to Select Countries']");
	By countrySuggestion = By.xpath("//ul[@id='ui-id-1']/li");
	By selectCountry = By.className("ui-menu-item-wrapper");
	By selectedCountry = By.id("autocomplete");

	public WebElement countryTextField() {
		return driver.findElement(countryTextField);
	}
	
	public List<WebElement> countrySuggestion() {
		return driver.findElements(countrySuggestion);
	}
	
	public WebElement selectCountry() {
		return driver.findElement(selectCountry);
	}
	
	public WebElement selectedCountry() {
		return driver.findElement(selectedCountry);
	}

}
