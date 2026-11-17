Feature: FizzBuzz Game

  Scenario: Number divisible by 3
    Given the input number is 9
    When I play FizzBuzz
    Then the output should be "Fizz"

  Scenario: Number divisible by 5
    Given the input number is 10
    When I play FizzBuzz
    Then the output should be "Buzz"

  Scenario: Number divisible by both 3 and 5
    Given the input number is 15
    When I play FizzBuzz
    Then the output should be "FizzBuzz"

  Scenario: Number not divisible by 3 or 5
    Given the input number is 7
    When I play FizzBuzz
    Then the output should be "7"