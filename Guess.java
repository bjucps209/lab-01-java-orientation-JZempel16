import java.util.Random;
import java.util.Scanner;

class Guess {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int secretNum = random.nextInt(10);
        int numGuesses = 0;
        int guess = 0;

        while (guess != secretNum) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;

            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("You got it!!");
            }
        }

        System.out.println("it took you " + numGuesses + " guesses.");
    }

}

/*
 * 
 * print("It took you", numGuesses, "guesses.")
 */