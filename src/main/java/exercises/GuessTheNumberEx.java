package exercises;

import java.util.Scanner;

/**
 * Guess the number from 1 to 100 <br />
 *
 * User keeps inputting their guess until they get it right <br />
 * Print out the hint "too high/ too low" based on user guess. <br />
 * Print out "Correct" in case it is correct.
 *
 * @author PhatNguyen
 * @created 07/09/2025 - 20:58
 * @project learn-java-w3school
 */
public class GuessTheNumberEx {
    public static int getRandomNumberInRange(int from, int to) {
        return from + (int) (Math.random() * (to - from + 1));
    }

    public static void guessTheNumber() {
        int randomNumber = getRandomNumberInRange(1, 100);
        int guess;
        boolean isCorrect = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Input your guess: ");
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Correct!");
                isCorrect = true;
            }

            if (guess > randomNumber) {
                System.out.println("Too high!");
            }

            if (guess < randomNumber) {
                System.out.println("Too low!");
            }
        } while (!isCorrect);

        scanner.close();
    }

    public static void main(String[] args) {
        guessTheNumber();
    }
}
