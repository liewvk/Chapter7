import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 7;
        int guess = 0;
        int attempts = 0;

        System.out.println("Number Guessing Game");
        System.out.println("--------------------");
        System.out.println("Guess a number between 1 and 10.");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        System.out.println("Attempts: " + attempts);

        input.close();
    }
}
