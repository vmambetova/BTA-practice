package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.GeneralSteps;

import static core.utils.Constants.RegistrationForm.homePage;

public class StepdefsBTA extends GeneralSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        driver.get(homePage);
    }

    @When("^I go to travel$")
    public void iGoToTravel() {
    }

    @And("^I change the destination to India$")
    public void iChangeTheDestinationToIndia() {
    }

    @Then("^I see the destination changed$")
    public void iSeeTheDestinationChanged() {
    }

    @And("^I change the activity to sport$")
    public void iChangeTheActivityToSport() {
    }

    @Then("^I see the activity changed$")
    public void iSeeTheActivityChanged() {
    }

    @And("^I go the the next step$")
    public void iGoTheTheNextStep() {
    }

    @And("^I choose Optimal\\+$")
    public void iChooseOptimal() {
    }

    @And("^I click \"([^\"]*)\"$")
    public void iClick(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The form opens$")
    public void theFormOpens() {
    }

    @And("^I proceed to the next step$")
    public void iProceedToTheNextStep() {
    }

    @Then("^I see all the fields are empty$")
    public void iSeeAllTheFieldsAreEmpty() {
    }
}
