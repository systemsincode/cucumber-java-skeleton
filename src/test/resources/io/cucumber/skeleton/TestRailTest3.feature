@All
Feature: TestRailTest Feature File 3

  Background: Gherkin background
    Given Gherkin background step that passes

  Scenario: a few cukes
    Given I have 42 cukes in my testRailTest
    When I wait 1 hour
    Then my testRailTest should growl

  Scenario: In TestRail scenario that passes
    Given Gherkin step
    Then Gherkin success

  Scenario: In TestRail scenario that fails
    Given Gherkin step
    Then Gherkin failure

  Scenario: In TestRail unimplemented scenario
    Given Gherkin unimplemented step

  Scenario: In TestRail with existing steps passes
    Given Gherkin step
    Then Gherkin success

  Scenario: In TestRail with existing steps fails
    Given Gherkin step
    Then Gherkin failure

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

  Scenario: Gherkin only scenario with data table that passes
    Given Gherkin datatable step
      | a     |
      | b     |
      | c     |

  Scenario: Gherkin only scenario with data table that fails
    Given Gherkin datatable step
      | a     |
      | b     |
      | a     |

  Scenario Outline: Gherkin Scenario Outline <uniqueid>
    Given Gherkin parameterised step <param>

    Examples: Various parameter values to use
      | uniqueid  | param |
      | 1         | a     |
      | 2         | b     |
      | 3         | c     |

  Scenario Outline: Gherkin Scenario Outline fails <uniqueid>
    Given Gherkin parameterised step that fails <param>

    Examples: Various parameter values to use
      | uniqueid  | param |
      | 1         | a     |
      | 2         | b     |
      | 3         | c     |

  Scenario Outline: Gherkin Scenario Outline partially fails <uniqueid>
    Given Gherkin parameterised step that partially fails <param>

    Examples: Various parameter values to use
      | uniqueid  | param |
      | 1         | a     |
      | 2         | b     |
      | 3         | c     |
