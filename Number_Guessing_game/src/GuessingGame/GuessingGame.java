package GuessingGame;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; 
        int attempts = 0;
        boolean isCorrect = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                isCorrect = true;
                System.out.println("Congratulations! You guessed the secret number in " + attempts + " attempts!");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Guess again.");
            } else {
                System.out.println("Too high! Guess again.");
            }
        }
        
        scanner.close();
    }
}
