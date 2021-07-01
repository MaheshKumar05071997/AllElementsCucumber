package stepDefinition;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjects.DropDown;
import resources.BaseClass;

@SuppressWarnings("deprecation")

@RunWith(Cucumber.class)
public class step_DropDown extends BaseClass {

	DropDown dropDown;
	Select select;
	
	
	@Given("^user selects the \"([^\"]*)\"$")
	public void user_selects_the_something(String strArg1) throws Throwable {
		dropDown = new DropDown(driver);
		select = new Select(dropDown.dropDown());
		select.selectByValue(strArg1);
		String optionValue = dropDown.dropDown().getText();
		System.out.println(optionValue);
		//Assert.assertEquals("Option1", optionValue);

	}

	@Then("^user is able to see the \"([^\"]*)\" is selected$")
	public void user_is_able_to_see_the_something_is_selected(String strArg1) throws Throwable {

	}

}
