package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.SumTable;
import resources.BaseClass;


@RunWith(Cucumber.class)
public class step_SumTable extends BaseClass {

	SumTable sumTable;
	public String eachValue;
	public int sum = 0;
	public int exp = 235;

	@Given("^user is able to see the values present in the table$")
	public void user_is_able_to_see_the_values_present_in_the_table() throws Throwable {
		sumTable = new SumTable(driver);
		for (WebElement values : sumTable.prices()) {
			eachValue = values.getText();
			sum = sum + Integer.parseInt(eachValue);
			System.out.println(sum);
			// System.out.println(eachValue);
		}
		Assert.assertEquals(sum, exp);
	}

	@When("^user is able to add all the values present in the table$")
	public void user_is_able_to_add_all_the_values_present_in_the_table() throws Throwable {
//		
	}

	@Then("^the sum of all the values are same as displayed on the UI$")
	public void the_sum_of_all_the_values_are_same_as_displayed_on_the_ui() throws Throwable {

	}

}
