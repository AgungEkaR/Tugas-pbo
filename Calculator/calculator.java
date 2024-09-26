
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Calculator {

    private Operation operation;

    public Calculator() {
        operation = new Operation();
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = operation.add(num1, num2);
                break;
            case '-':
                result = operation.subtract(num1, num2);
                break;
            case '*':
                result = operation.multiply(num1, num2);
                break;
            case '/':
                result = operation.divide(num1, num2);
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        System.out.println("The result is: " + result);
    }

    public static void startCalculate() {
        Calculator calc = new Calculator();
        calc.calculate();
    }
}


