@sanity
Feature: search

  As a end user
  I want to navigate to community page
  and i want to search for a topic
  so that i will view all the relevant searched items

  Background:

    Given I am on the home page

  Scenario:  search validation


    Then  i will navigate to community page
    When  i will search for the topic "We got a banking licence"
    Then i should view all the relevant searched items





