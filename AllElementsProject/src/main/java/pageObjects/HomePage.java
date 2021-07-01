package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By practiceLink = By.linkText("Practice");
	By automation_practice_2 = By.linkText("Automation Practise - 2");

	public WebElement practiceLink() {
		return driver.findElement(practiceLink);
	}
	
	public WebElement automation_practice_2() {
		return driver.findElement(automation_practice_2);
	}

}
