import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 5;
        int guess = 0;

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }

        if (guess != numberToGuess) {
            System.out.println("Game Over. The number was: " + numberToGuess);
        }

        scanner.close();
    }
}
