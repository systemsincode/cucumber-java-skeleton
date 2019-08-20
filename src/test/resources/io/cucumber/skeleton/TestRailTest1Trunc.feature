@All
Feature: TestRailTest Feature File 1

  Background: Gherkin background
    Given Gherkin background step that passes

  Scenario: a few cukes
    Given I have 42 cukes in my testRailTest
    When I wait 1 hour
    Then my testRailTest should growl

  Scenario: In TestRail scenario that passes
    Given Gherkin step
    Then Gherkin success
