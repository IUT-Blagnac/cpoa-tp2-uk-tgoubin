Feature: Chocolate boiler

  Scenario: Run the chocolate boiler and play with it
    Given I create a chocolate boiler
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