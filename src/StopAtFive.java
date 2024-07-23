import java.util.Scanner;

public class StopAtFive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Loop until the user enters the number 5
        while (number != 5) {
            // Ask the user to provide a number
            System.out.println("Give a number: ");
            number = scanner.nextInt();
        }

        // Print a message once the loop exits
        System.out.println("You entered 5. The loop has stopped.");
    }
}
