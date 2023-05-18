Feature: Cettire Login

Scenario: Simple Login

Given I launch Chrome browser
    And open Cettire HomePage
    And click the signIn_Link on top right corner
    When I enter Username and Password
    And click on Login button
    Then close the browser
    
    Scenario: Select All mens Bag from Sale
    
    Given I launch Chrome browser
    And open Cettire HomePage
    And click the signIn_Link on top right corner
    When I enter Username and Password
    And click on Login button
    Then Hower mouse over SALE and click Mens saleBag
    Then close the browser
    

    

