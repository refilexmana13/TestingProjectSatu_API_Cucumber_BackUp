package StepDef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStepdefs {

    ApiPage apiPage;

    public ApiStepdefs(){
        this.apiPage = new ApiPage();
    }

    @Given("prepare url valid for get list data")
    public void prepareUrlValidForGetListData() {
        // Write code here that turns the phrase above into concrete actions
        apiPage.prepareUrl();
    }

    @And("hit api get list data")
    public void hitApiGetListData() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("verify status code")
    public void verifyStatusCode() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("verify response message")
    public void verifyResponseMessage() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("verify data list should be not null")
    public void verifyDataListShouldBeNotNull() {
        // Write code here that turns the phrase above into concrete actions

    }
}
