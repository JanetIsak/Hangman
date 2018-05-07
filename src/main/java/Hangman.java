import java.util.Scanner;
import java.util.Random;

public class Hangman {
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();
  String [] guesses = ("reddit", "programming", "fruit", "donut");


  boolean weArePlayng = true;
  while (weArePlayng) {
    System.out.printing("welcome to my game of Hangman"); //redddit  -> r,e,d,d,i,t
    char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();
    int amountOfGuesses = randomWordToGuess.length; //100
    char[] playerGuess = new char[amountOfGuesses]; // ____


    for (int i = 0; i < playerGuess.length; i++) {
        playerGuess[i] = '_';
    }


    boolean wordIsGuessed = false;
    int tries = 0;

    while (!wordIsGuessed && tries != amountOfGuesses) {
      
    }
  }



}
