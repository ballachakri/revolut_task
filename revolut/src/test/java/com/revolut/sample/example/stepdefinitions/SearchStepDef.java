package com.revolut.sample.example.stepdefinitions;

import com.revolut.sample.example.HeaderPage.HeaderPage;
import com.revolut.sample.example.ResultsPage.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchStepDef {

    private HeaderPage headerPage = new HeaderPage ();
    private ResultsPage resultsPage = new ResultsPage ();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page ( ) {
        String url = resultsPage.toGetCurrentURL ();
        assertThat ("not on the home page ", url.contains ("revolut"));
    }

    @When("^i will navigate to community page$")
    public void i_will_navigate_to_community_page ( ) {
        headerPage.goToCommunityPage ();
    }

    @When("^i will search for the topic \"([^\"]*)\"$")
    public void i_will_search_for_the_topic(String topicToChoose)
    {
        headerPage.searchTopic (topicToChoose);
    }

    @Then("^i should view all the relevant searched items$")
    public void i_should_view_all_the_relevant_searched_items ( ) {
        String getTopic = resultsPage.getSearchedTopic ();
        assertThat ("wrong topic searched", getTopic.contains ("banking licence"));

    }

}
