import java.util.Scanner;

public class Multiply {
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = multiply(num1, num2);
        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
        
        scanner.close();
    }
}
