package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {

	public WebDriver driver;

	public RadioButton(WebDriver driver) {
		this.driver = driver;
	}

	By radioBtn = By.className("radioButton");

	public List<WebElement> radioBtn() {
		return driver.findElements(radioBtn);
	}

}
