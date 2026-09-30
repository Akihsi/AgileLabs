import java.util.Scanner;

public class EmployeeIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter monthly salary of employee (in Rs.): ");
        double monthlySalary = scanner.nextDouble();
        double annualSalary = monthlySalary * 12;
        double incrementPercentage;
        if (monthlySalary < 100000) {
            incrementPercentage = 0.15; // 15%
        } else if (monthlySalary <= 200000) {
            incrementPercentage = 0.10; // 10%
        } else {
            incrementPercentage = 0.05; // 5%
        }
        double annualIncrement = annualSalary * incrementPercentage;
        System.out.println("Annual Salary: Rs. " + annualSalary);
        System.out.println("Annual Increment Amount: Rs. " + annualIncrement);
        scanner.close();
    }
}