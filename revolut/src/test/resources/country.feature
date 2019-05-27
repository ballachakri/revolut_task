@sanity
Feature: country

  As a end user
  i want to select country United States
  so that i should then be redirected to United States page content

  Scenario: country validation

    Given i am on the home page
    When i select the country "United States"
    Then i should be redirected to United States page content