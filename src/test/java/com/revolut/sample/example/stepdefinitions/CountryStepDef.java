package com.revolut.sample.example.stepdefinitions;

import com.revolut.sample.example.DriverManager.DriverManager;
import com.revolut.sample.example.FooterPage.FooterPage;
import com.revolut.sample.example.ResultsPage.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class CountryStepDef extends DriverManager {

    private FooterPage footerPage = new FooterPage ();
    private ResultsPage resultsPage = new ResultsPage ();

    @Given("^i am on the home page$")
    public void i_am_on_the_home_page ( ) {
        String url = resultsPage.toGetCurrentURL();
        assertThat ("Not on the home page ", url.contains ("revolut"));
    }

    @When("^i select the country \"([^\"]*)\"$")
    public void i_select_the_country (String country) {
        footerPage.gotToCountryList ();
        footerPage.selectCountry (country);
    }

    @Then("^i should be redirected to United States page content$")
    public void i_should_be_redirected_to_United_States_page_content ( ) {
        String url = resultsPage.toGetCurrentURL ();
        assertThat ("incorrect country selected", url.contains ("en-US"));
    }
}
