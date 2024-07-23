import java.util.Scanner;

public class CountToEleven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number less than 11
        System.out.println("Enter a number less than 11: ");
        int number = scanner.nextInt();

        // Check if the entered number is less than 11
        if (number >= 11) {
            System.out.println("The number must be less than 11.");
        } else {
            // Print numbers from the entered number up to 11
            for (int i = number; i <= 11; i++) {
                System.out.println(i);
            }
        }
    }
}
