import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;

        // Loop until a valid number is entered
        while (!isValid) {
            System.out.println("Enter a number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                isValid = true; // If parsing is successful, exit the loop
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Please enter a number.");
            }
        }

        // Print the multiplication table for the entered number up to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
