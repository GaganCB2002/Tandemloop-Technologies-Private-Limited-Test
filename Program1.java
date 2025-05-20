// Problem-1.java
import java.util.Scanner;

class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String divide(double a, double b) {
        if (b == 0) {
            return "Error: Cannot divide by zero!";
        }
        return String.valueOf(a / b); 
    }

    public String calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return String.valueOf(add(a, b));
            case "subtract":
                return String.valueOf(subtract(a, b));
            case "multiply":
                return String.valueOf(multiply(a, b));
            case "divide":
                return divide(a, b); 
            default:
                return "Error: Invalid operation type.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("Enter first number (a): ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number (b): ");
            double num2 = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Enter type of operation (add, subtract, multiply, divide): ");
            String opType = scanner.nextLine();

            String result = calc.calculate(num1, num2, opType);
            System.out.println("Result: " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}