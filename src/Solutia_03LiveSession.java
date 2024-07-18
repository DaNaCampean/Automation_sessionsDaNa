import java.util.Scanner;
public class Solutia_03LiveSession {
//

    //public class InteractiveCalculator {
        // Function to get the operation from the user
        public static String getOperation(Scanner scanner) {
            System.out.println("Enter the operation (+, -, *, /) or");
            System.out.println("Type 'reset' to reset the sum");
            System.out.println("Type 'history' to display the history");
            System.out.println("Type 'exit' to exit:");
            return scanner.nextLine().trim();
        }
        // Function to perform the calculation based on the chosen operation
        public static double performCalculation(String operation, double currentSum, double number) {
            switch (operation) {
                case "+":
                    return currentSum + number;
                case "-":
                    return currentSum - number;
                case "*":
                    return currentSum * number;
                case "/":
                    if (number != 0) {
                        return currentSum / number;
                    } else {
                        System.out.println("Cannot divide by zero, ignoring this number.");
                        return currentSum;
                    }
                default:
                    System.out.println("Invalid operation.");
                    return currentSum;
            }
        }
        public static void calculator(double initialSum) {
            Scanner scanner = new Scanner(System.in);
            double currentSum = initialSum;
            StringBuilder history = new StringBuilder(Double.toString(initialSum));
            boolean running = true;
            System.out.println("Starting calculator..");
            System.out.println("Welcome!");
            while (running) {
                String operation = getOperation(scanner);
                switch (operation.toLowerCase()) {
                    case "exit":
                        running = false;
                        System.out.println("Exiting calculator. Have a great day!");
                        break;
                    case "reset":
                        currentSum = initialSum;
                        history = new StringBuilder(Double.toString(initialSum));
                        System.out.println("Sum has been reset.");
                        System.out.println("Current sum: " + currentSum);
                        break;
                    case "history":
                        System.out.println("History: " + history);
                        break;
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        while (true) {
                            System.out.println("Enter a number or type '=' to finish this operation: ");
                            String input = scanner.nextLine().trim();
                            if (input.equals("=")) {
                                break;
                            }
                            double number = Double.parseDouble(input);
                            double newSum = performCalculation(operation, currentSum, number);
// Only update if the number wasn't zero during division
                            if (number != 0 || !operation.equals("/")) {
                                currentSum = newSum;
                                history.append(" ").append(operation).append(" ").append(number);
                            }
                        }
                        System.out.println(currentSum);
                        System.out.println("Operation ended.");
                        break;
                    default:
                        System.out.println("Invalid operation. Please enter a valid operation.");
                        break;
                }
            }
            scanner.close();
        }
        public static void main(String[] args) {
            calculator(10);
        }
    }
}
