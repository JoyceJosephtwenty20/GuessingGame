
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random systemGuess = new Random();
        Scanner userInput = new Scanner(System.in);
        int randomNumber = systemGuess.nextInt(9) + 1;
        int userGuess;
        System.out.println("I am thinking about a number between 1 and 10..\nCan you guess it?");
        userGuess = userInput.nextInt();

        do {
            if (userGuess < randomNumber) {
                System.out.println("It's too low. Guess again");
                userGuess = userInput.nextInt();
            }
            else if (userGuess > randomNumber) {
                System.out.println("It's too high. Guess again");
                userGuess = userInput.nextInt();
            }
        } while (userGuess > randomNumber || userGuess < randomNumber) ;

        System.out.println("That's right! You are a good guesser.");
    }
}