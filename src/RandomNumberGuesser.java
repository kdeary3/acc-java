import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGuesser {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Input lower limit: ");
        int lower = userInput.nextInt();
        System.out.println("Input upper limit: ");
        int upper = userInput.nextInt();
        int guess = ThreadLocalRandom.current().nextInt(lower, upper);

        System.out.println("Input number for me to guess: ");
        int answer = userInput.nextInt();

        if (guess == answer) {
            System.out.println("CPU guesses: " + guess + ". Correct!");
        }
        else {
            while (guess != answer) {
                if (guess < answer) {
                    System.out.println("CPU guesses: " + guess + ". Too low.");
                    lower = guess;
                    guess = ThreadLocalRandom.current().nextInt(guess, upper);
                }
                if (guess > answer) {
                    System.out.println("CPU guesses: " + guess + ". Too high.");
                    upper = guess;
                    guess = ThreadLocalRandom.current().nextInt(lower, guess);
                }
            }
        }
        System.out.println("CPU guesses: " + guess + ". Correct!");
        }

    }
