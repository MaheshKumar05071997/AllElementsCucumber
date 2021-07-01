package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown {

	public WebDriver driver;

	public DropDown(WebDriver driver) {
		this.driver = driver;
	}

	By dropDown = By.xpath("//select[@id='dropdown-class-example']");

	public WebElement dropDown() {
		return driver.findElement(dropDown);
	}

}
