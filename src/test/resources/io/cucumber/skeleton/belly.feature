Feature: TestRailTestFeatureFile

  Background: Gherkin background
    Given Gherkin background step that passes

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

  @ignore
  Scenario: Gherkin only scenario that is skipped(@ignore)
    Given Gherkin step
    Then Gherkin failure

  Scenario: Gherkin only unimplemented scenario
    Given Gherkin unimplemented step

  Scenario: Gherkin only pending scenario
    Given Gherkin only pending step

  Scenario: In TestRail with existing steps passes
    Given Gherkin step
    Then Gherkin success

  Scenario: In TestRail with existing steps fails
    Given Gherkin step
    Then Gherkin failure

  Scenario Outline: Gherkin Scenario Outline
    Given Gherkin parameterised step <param>

    Examples: Various parameter values to use
      | param |
      | a     |
      | b     |
      | c     |

  Scenario Outline: Gherkin Scenario Outline fails
    Given Gherkin parameterised step that fails <param>

    Examples: Various parameter values to use
      | param |
      | a     |
      | b     |
      | c     |

  Scenario Outline: Gherkin Scenario Outline partially fails
    Given Gherkin parameterised step that partially fails <param>

    Examples: Various parameter values to use
      | param |
      | a     |
      | b     |
      | c     |
