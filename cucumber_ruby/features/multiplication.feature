Feature: Multiplication of two numbers

  Scenario: Multiply two positive numbers
    Given the first number is 5
    And the second number is 4
    When I multiply the two numbers
    Then the result should be 20

  Scenario: Multiply by zero
    Given the first number is 10
    And the second number is 0
    When I multiply the two numbers
    Then the result should be 0

  Scenario: Multiply negative and positive numbers
    Given the first number is -5
    And the second number is 4
    When I multiply the two numbers
    Then the result should be -20