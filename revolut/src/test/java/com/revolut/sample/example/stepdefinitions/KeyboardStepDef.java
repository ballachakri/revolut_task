package com.revolut.sample.example.stepdefinitions;

import com.revolut.sample.example.HeaderPage.HeaderPage;
import com.revolut.sample.example.ResultsPage.ResultsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

public class KeyboardStepDef {

    private HeaderPage headerPage = new HeaderPage ();
    private ResultsPage resultsPage = new ResultsPage ();

    @When("^i will click the hamburger option$")
    public void i_will_click_the_hamburger_option ( ) {
        headerPage.goToHamburgerOptions ();
    }

    @Then("^i should view all the keyboard shortcuts$")
    public void i_should_view_all_the_keyboard_shortcuts ( ) {
        ArrayList <String> allList = resultsPage.getAllKeyboardShortcuts ();
        //Assert with the content of keyboard shortcut
        assertThat ("wrong keyboard shortcuts captured", allList, hasItem ("g, h Home"));
        // Assert with total number o the keyword shortcuts
        assertThat ("not all shortcuts captured", allList, hasSize (44));
    }

}
