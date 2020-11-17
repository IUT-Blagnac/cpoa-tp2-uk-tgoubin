Feature: Chocolate boiler

  Scenario: I run the test1 of ChocolateBoilerTest.java
    Given I get the chocolate boiler
    Then I check that the boiler is "not boiled" and "empty"
  
  Scenario: I run the test2 of ChocolateBoilerTest.java
    Given I get the chocolate boiler
    And I fill the boiler
    Then I check that the boiler is "not boiled" and "not empty"
  
  Scenario: I run the test3 of ChocolateBoilerTest.java
    Given I get the chocolate boiler
    And I fill the boiler
    And I boil the boiler
    Then I check that the boiler is "boiled" and "not empty"
  
  Scenario: I run the test4 of ChocolateBoilerTest.java
    Given I get the chocolate boiler
    And I fill the boiler
    And I boil the boiler
    And I empty the boiler
    Then I check that the boiler is "boiled" and "empty"

  Scenario: Run the chocolate boiler and play with it
    Given I get the chocolate boiler
    Then I check that the boiler is "not boiled" and "empty"
    And I fill the boiler
    Then I check that the boiler is "not boiled" and "not empty"
    And I fill the boiler
    And I boil the boiler
    Then I check that the boiler is "boiled" and "not empty"
    And I fill the boiler
    And I boil the boiler
    And I empty the boiler
    Then I check that the boiler is "boiled" and "empty"