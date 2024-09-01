import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    private static final String[] WORDS = {"JAVA", "PROGRAMMING", "HANGMAN", "DEVELOPER", "COMPUTER"};
    private static final int MAX_TRIES = 6;
    private static String wordToGuess;
    private static char[] guessedWord;
    private static ArrayList<Character> guessedLetters = new ArrayList<>();
    private static int remainingTries = MAX_TRIES;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startGame();

        while (remainingTries > 0 && !isWordGuessed()) {
            System.out.println("Current word: " + String.valueOf(guessedWord));
            System.out.println("Guessed letters: " + guessedLetters);
            System.out.println("Remaining tries: " + remainingTries);
            System.out.print("Enter a letter: ");
            char guessedLetter = scanner.next().toUpperCase().charAt(0);

            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("You've already guessed that letter.");
                continue;
            }

            guessedLetters.add(guessedLetter);
            if (wordToGuess.indexOf(guessedLetter) >= 0) {
                updateGuessedWord(guessedLetter);
            } else {
                remainingTries--;
                System.out.println("Incorrect guess!");
            }
        }

        if (remainingTries > 0) {
            System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game Over! The word was: " + wordToGuess);
        }

        scanner.close();
    }

    private static void startGame() {
        wordToGuess = WORDS[(int) (Math.random() * WORDS.length)];
        guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '_');
    }

    private static void updateGuessedWord(char letter) {
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedWord[i] = letter;
            }
        }
    }

    private static boolean isWordGuessed() {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
