// Importing necessary Java package for user input
import java.util.Scanner;

public class SwitchGame {

    // Enum to represent different actions in the adventure game
    enum Direction {
        NORTH, SOUTH, EAST, WEST, QUIT
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        Direction direction;

        // Introduction to the game
        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("You find yourself in a dark forest. Choose a direction to explore.");

        // Game loop: keep asking the player to choose a direction until they quit
        while (true) {
            // Prompt the user to enter a direction
            System.out.println("\nEnter a direction (NORTH, SOUTH, EAST, WEST) or type QUIT to exit:");
            String input = scanner.nextLine().toUpperCase(); // Convert input to uppercase for enum matching
            direction  = Direction.valueOf(input);

            switch (direction) {
                case NORTH:
                    System.out.println("You head north and find a peaceful river.");
                    break;
                case SOUTH:
                    System.out.println("You go south and encounter a ferocious dragon!");
                    break;
                case EAST:
                    System.out.println("You travel east and discover an abandoned village.");
                    break;
                case WEST:
                    System.out.println("You walk west and find a hidden treasure chest.");
                    break;
                case QUIT:
                    System.out.println("Thank you for playing! Your adventure ends here.");
                    return;
                default:
                    System.out.println("Unknown direction. Please choose again.");
            }
        }
    }
}