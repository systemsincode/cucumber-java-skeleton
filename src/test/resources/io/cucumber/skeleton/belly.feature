Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario: Existing scenario that passes
    Given Gherkin step
    Then Gherkin success

  Scenario: Existing scenario that fails
    Given Gherkin step
    Then Gherkin failure

  Scenario: Existing unimplemented scenario
    Given Gherkin unimplemented step

  Scenario: Gherkin only scenario that passes
    Given Gherkin step
    Then Gherkin success

  Scenario: Gherkin only scenario that fails
    Given Gherkin step
    Then Gherkin failure

  Scenario: Gherkin only unimplemented scenario
    Given Gherkin unimplemented step

  Scenario: In TestRail with existing steps passes
    Given Gherkin step
    Then Gherkin success

  Scenario: In TestRail with existing steps fails
    Given Gherkin step
    Then Gherkin failure