import java.util.Scanner;

public class Calculator {
    
    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Division method
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display menu
        System.out.println("=== CALCULATOR ===");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        // Get numbers from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        String operation = "";
        boolean validChoice = true;
        
        // Perform operation based on user choice
        switch (choice) {
            case 1:
                result = add(num1, num2);
                operation = "+";
                break;
            case 2:
                result = subtract(num1, num2);
                operation = "-";
                break;
            case 3:
                result = multiply(num1, num2);
                operation = "*";
                break;
            case 4:
                result = divide(num1, num2);
                operation = "/";
                break;
            default:
                System.out.println("Error: Invalid choice! Please select 1-4.");
                validChoice = false;
        }
        
        // Display result
        if (validChoice) {
            System.out.println("\nResult: " + num1 + " " + operation + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
}
