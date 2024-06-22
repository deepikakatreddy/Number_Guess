import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasWon = false;

        while (numberOfTries < 10) {
            System.out.println("Guess a number between 1 and 100:");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Correct! You win! It took you " + numberOfTries + " tries.");
        } else {
            System.out.println("Game over! The number was " + numberToGuess);
        }
    }
}