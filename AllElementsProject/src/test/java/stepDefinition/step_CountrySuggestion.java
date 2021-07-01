package stepDefinition;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjects.CountrySuggestion;
import resources.BaseClass;

@RunWith(Cucumber.class)
public class step_CountrySuggestion extends BaseClass {

	CountrySuggestion countrySuggestion;

	@Given("^user enters \"([^\"]*)\" in the text field$")
	public void user_enters_something_in_the_text_field(String strArg1) throws Throwable {
		countrySuggestion = new CountrySuggestion(driver);
		countrySuggestion.countryTextField().sendKeys(strArg1);
		for (WebElement ele : countrySuggestion.countrySuggestion()) {
			if (ele.getText().equalsIgnoreCase(strArg1)) {
				ele.click();
			}
		}
	}

	@Then("^\"([^\"]*)\" is selected$")
	public void something_is_selected(String strArg2) throws Throwable {
		
		countrySuggestion = new CountrySuggestion(driver);
		countrySuggestion.selectedCountry().getText();
	}

}
