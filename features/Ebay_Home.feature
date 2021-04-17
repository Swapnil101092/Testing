

Feature: Ebay Home Page Scenario
@P1
Scenario: Advance Search Link

//Given When And Then

Given I am on Ebay Home Page
When I click on Advance Link
Then I navigate to Advance Search Page

Scenario: Search Item Count
Given I am on Ebay Home Page
When I Search For Iphone 11
Then I validate At Least 1000 Search Items Present



