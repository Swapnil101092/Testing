$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/Ebay_AdvancedSearch.feature");
formatter.feature({
  "name": "Ebay Advanced Search Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ebay Logo On Advanced Serach Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am Ebay Advanced Serach Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Ebay_AdvancedSearch.i_am_Ebay_Advanced_Serach_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Ebay Logo",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Ebay_AdvancedSearch.i_click_on_Ebay_Logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Am Navigated to Ebay Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Ebay_AdvancedSearch.i_Am_Navigated_to_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:features/Ebay_Home.feature");
formatter.feature({
  "name": "Ebay Home Page Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Advance Search Link",
  "description": "//Given When And Then",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@P1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Ebay_Home_Steps.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Advance Link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Ebay_Home_Steps.i_click_on_Advance_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Advance Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Ebay_Home_Steps.i_navigate_to_Advance_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search Item Count",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Ebay Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Ebay_Home_Steps.i_am_on_Ebay_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Search For Iphone 11",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Ebay_Home_Steps.i_Search_For_Iphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate At Least 1000 Search Items Present",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Ebay_Home_Steps.i_validate_At_Least_Search_Items_Present()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});