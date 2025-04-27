import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Calculation = true;

        while (Calculation == true) {
            System.out.println("Welcome to Simple Calculator");
            System.out.println("Choose operation: +, -, *, /");
            String operation = scanner.next();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = 0;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid operation! Please choose a valid operation (+, -, *, /)");
                    break;
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("no")) {
                Calculation = false;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the calculator!");
    }
}

