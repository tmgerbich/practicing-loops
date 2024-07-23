import java.util.Scanner;

public class TakeABreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        // Loop until the user enters "yes"
        while (!response.equalsIgnoreCase("yes")) {
            // Ask the user if they want to take a break
            System.out.println("Do you want to take a break?");
            response = scanner.nextLine();
        }

        // Print a message once the loop exits
        System.out.println("Break Time!");
    }
}
