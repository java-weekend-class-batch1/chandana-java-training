package Course;

import java.util.Scanner;

public class PasswordRetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String enteredPassword;
        int attempts = 0;

        do {
            System.out.print("Enter password: ");
            enteredPassword = sc.nextLine();
            attempts++;

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access Granted!");
                break;
            } else {
                System.out.println("Incorrect Password.");
            }

        } while (attempts < 3);

        if (attempts == 3 && !enteredPassword.equals(correctPassword)) {
            System.out.println("Maximum attempts reached. Access Denied.");
        }

        sc.close();
    }
}