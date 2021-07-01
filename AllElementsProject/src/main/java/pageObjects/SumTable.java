package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SumTable {

	public WebDriver driver;

	public SumTable(WebDriver driver) {
		this.driver = driver;
	}

	By prices = By.xpath("//table[@name='courses']/tbody/tr/td[3]");

	public List<WebElement> prices() {
		return driver.findElements(prices);
	}

}
