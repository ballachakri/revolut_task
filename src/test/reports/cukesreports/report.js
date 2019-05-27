$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resources/country.feature");
formatter.feature({
  "line": 2,
  "name": "country",
  "description": "\r\nAs a end user\r\ni want to select country United States\r\nso that i should then be redirected to United States page content",
  "id": "country",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "duration": 17607328923,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "country validation",
  "description": "",
  "id": "country;country-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "i am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "i select the country \"United States\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "i should be redirected to United States page content",
  "keyword": "Then "
});
formatter.match({
  "location": "CountryStepDef.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 434493087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United States",
      "offset": 22
    }
  ],
  "location": "CountryStepDef.i_select_the_country(String)"
});
formatter.result({
  "duration": 2228122010,
  "status": "passed"
});
formatter.match({
  "location": "CountryStepDef.i_should_be_redirected_to_United_States_page_content()"
});
formatter.result({
  "duration": 421855448,
  "status": "passed"
});
formatter.after({
  "duration": 878833486,
  "status": "passed"
});
formatter.uri("resources/keyboard.feature");
formatter.feature({
  "line": 2,
  "name": "keyboard shortcuts",
  "description": "\r\nAs a end user\r\nI want to navigate to community page\r\nand i click on hamburger menu\r\nso that i will view all the keyboard shortcuts",
  "id": "keyboard-shortcuts",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "duration": 11385291633,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "keyboard shortcuts validation",
  "description": "",
  "id": "keyboard-shortcuts;keyboard-shortcuts-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "i will navigate to community page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "i will click the hamburger option",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "i should view all the keyboard shortcuts",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.i_will_navigate_to_community_page()"
});
formatter.result({
  "duration": 625666903,
  "status": "passed"
});
formatter.match({
  "location": "KeyboardStepDef.i_will_click_the_hamburger_option()"
});
formatter.result({
  "duration": 3407190201,
  "status": "passed"
});
formatter.match({
  "location": "KeyboardStepDef.i_should_view_all_the_keyboard_shortcuts()"
});
formatter.result({
  "duration": 1578402817,
  "status": "passed"
});
formatter.after({
  "duration": 1283087239,
  "status": "passed"
});
formatter.uri("resources/search.feature");
formatter.feature({
  "line": 2,
  "name": "search",
  "description": "\r\nAs a end user\r\nI want to navigate to community page\r\nand i want to search for a topic\r\nso that i will view all the relevant searched items",
  "id": "search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "duration": 8509075916,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 11,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDef.i_am_on_the_home_page()"
});
formatter.result({
  "duration": 221557009,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "search validation",
  "description": "",
  "id": "search;search-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "i will navigate to community page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "i will search for the topic \"We got a banking licence\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "i should view all the relevant searched items",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.i_will_navigate_to_community_page()"
});
formatter.result({
  "duration": 354420228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We got a banking licence",
      "offset": 29
    }
  ],
  "location": "SearchStepDef.i_will_search_for_the_topic(String)"
});
formatter.result({
  "duration": 3785962141,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.i_should_view_all_the_relevant_searched_items()"
});
formatter.result({
  "duration": 792875649,
  "status": "passed"
});
formatter.after({
  "duration": 890241342,
  "status": "passed"
});
});