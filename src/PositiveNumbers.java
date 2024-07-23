import java.util.Scanner;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            // Ask the user to provide a number
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                // Inform the user that the number must be positive
                System.out.println("Number must be a positive number.");
            } else if (number == 0) {
                // End the program if the number is zero
                System.out.println("Program ends.");
                break;
            } else {
                // Print the positive number
                System.out.println("Number is " + number);
            }
        }
    }
}
