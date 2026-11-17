require_relative '../../programs/multiply'
require_relative '../../programs/fizzbuzz'

# Multiplication Step Definitions

Given('the first number is {int}') do |number|
  @first_number = number
end

Given('the second number is {int}') do |number|
  @second_number = number
end

When('I multiply the two numbers') do
  @result = multiply(@first_number, @second_number)
end

Then('the result should be {int}') do |expected|
  raise "Expected #{expected}, but got #{@result}" unless @result == expected

  puts "Multiplication result: #{@result}"
end

# FizzBuzz Step Definitions

Given('the input number is {int}') do |number|
  @input_number = number
end

When('I play FizzBuzz') do
  @output = fizzbuzz(@input_number)
end

Then('the output should be {string}') do |expected|
  raise "Expected #{expected}, but got #{@output}" unless @output == expected

  puts "FizzBuzz output: #{@output}"
end
