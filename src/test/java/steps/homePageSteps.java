package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class homePageSteps {
    homePage page = new homePage();

    @Given("I launch the application url")
    public void iLaunchTheApplicationUrl(){
        page.launchTheApplicationUrl();
    }

    @Then("I verify user is land on application url")
    public void iVerifyUserIsLandOnApplicationUrl() {
        page.verifyUserIsLandOnApplicationUrl();
    }

    @After
    public void tearDown(){
        page.tearDown();
    }

    @When("I search for {string} in search bar")
    public void iSearchForInSearchBar(String sText) throws InterruptedException {
        page.searchForInSearchBar(sText);
    }
}
