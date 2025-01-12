import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Declare variables for user input i.e. principal, rate and time
        double principal, rate, time;
        System.out.println("Enter the principal amount:");
        principal = scanner.nextFloat();
        System.out.println("Enter the annual interest rate :");
        rate = scanner.nextFloat();
        System.out.println("Enter the time period in years:");
        time = scanner.nextFloat();

        // Step 3: Perform calculations for simple interest
        double simpleInterest = (principal * rate * time )/ 100;

        // Step 4: Output the result
        String message = String.format("The Simple Interest generated is: %f",simpleInterest);
        System.out.println(message);
        // Step 5: Close the Scanner object (good practice)
    }
}