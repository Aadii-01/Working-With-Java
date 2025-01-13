import java.util.Scanner;

public class BudgetTrackerPlus {

    public static void main(String[] args) {

        // Declare and initialise scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking user input for monthly income
        System.out.println("Enter your monthly income: ");
        double monthlyIncome = scanner.nextDouble();

        // Taking user input for various expenses including rent, groceries
        // transportation and entertainment.
        System.out.println("Enter your expenses on rent: ");
        double rent = scanner.nextDouble();

        System.out.println("Enter your expense on groceries: ");
        double groceries = scanner.nextDouble();

        System.out.println("Enter your expense on transportation: ");
        double transport = scanner.nextDouble();

        System.out.println("Enter your expense on entertainment: ");
        double entertainment = scanner.nextDouble();

        // Calculating total expenses
        double totalExpense = rent + groceries + transport + entertainment;

        // Calculating remaining budget
        double remainingBudget = monthlyIncome - totalExpense;

        // Calculating percentage of income spent on each category
        double rentPercentage = (rent / monthlyIncome) * 100;
        double groceriesPercentage = (groceries / monthlyIncome) * 100;
        double transportationPercentage = (transport / monthlyIncome) * 100;
        double entertainmentPercentage = (entertainment / monthlyIncome) * 100;

        // Displaying budget summary
        System.out.println("\n********** Budget Summary **********");
        System.out.printf("Monthly Income: $%.2f\n", monthlyIncome);
        System.out.printf("Total Expenses: $%.2f\n", totalExpense);
        System.out.printf("Remaining Budget: $%.2f\n", remainingBudget);
        System.out.println("Expenses Breakdown:");
        System.out.printf("  Rent: $%.2f (%.2f%% of income)\n", rent, rentPercentage);
        System.out.printf("  Groceries: $%.2f (%.2f%% of income)\n", groceries, groceriesPercentage);
        System.out.printf("  Transportation: $%.2f (%.2f%% of income)\n", transport, transportationPercentage);
        System.out.printf("  Entertainment: $%.2f (%.2f%% of income)\n", entertainment, entertainmentPercentage);
        System.out.println("************************************");

        scanner.close();
    }
}