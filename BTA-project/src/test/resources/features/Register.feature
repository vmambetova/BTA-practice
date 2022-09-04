@TestAll
Feature: Register scenario tested

  Background:
    Given I am on the homepage


  Scenario:
    When I go to travel
    And I change the destination to India
    Then I see the destination changed
    And I change the activity to sport
    Then I see the activity changed
    And I go the the next step
    And I choose Optimal+
    And I click "Apskati, kas ir apdrošināts"
    Then The form opens
    And I proceed to the next step
    Then I see all the fields are empty

