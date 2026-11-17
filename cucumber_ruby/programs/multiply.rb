def multiply(a, b)
  a * b
end

if __FILE__ == $PROGRAM_NAME
  print "Enter first number: "
  a = gets.to_i

  print "Enter second number: "
  b = gets.to_i

  result = multiply(a, b)

  puts "Multiplication result: #{result}"
end
