package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;
import pageObjects.RadioButton;
import resources.BaseClass;

@RunWith(Cucumber.class)
public class step_RadioButton extends BaseClass {

	//public WebDriver driver;
	RadioButton radioButton;
	HomePage homePage;

	@Given("^User lands on main website$")
	public void user_lands_on_main_website() throws Throwable {
		driver = initializeBrowse();
	}

	@Given("^user clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_something_button(String strArg1) throws Throwable {
		radioButton = new RadioButton(driver);
		int radioCount = radioButton.radioBtn().size();
		for (int i = 0; i < radioCount; i++) {
			radioButton.radioBtn().get(i).click();
//			if (radioText.equalsIgnoreCase(strArg1)) {
//				System.out.println(strArg1);
//				radioButton.radioBtn().get(i).click();
//			}
		}
	}

	@Then("^\"([^\"]*)\" button is selected$")
	public void something_button_is_selected(String strArg2) throws Throwable {

	}

	@And("^user lands on Practice page$")
	public void user_lands_on_practice_page() throws Throwable {
		homePage = new HomePage(driver);
		homePage.practiceLink().click();
		homePage.automation_practice_2().click();
	}
	
	@And("^user closes browser$")
    public void user_closes_browser() throws Throwable {
        driver.quit();
	}

}
