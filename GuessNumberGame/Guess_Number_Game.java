/*  GUESS NUMBER GAME.

Guess Number Game is a simple guessing game where a user is supposed to guess a number between 0 and N (Here N=100). If guessed number is less than entered number it will print "Lesser" and if guessed number is greater than entered number it will print "Greater". It also prints the number of times we guess the number to win the game.

*/

package GuessNumberGame;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int noOfGuess;
    private int userInput;
    private int computerInput;

    public Game(){
        Random r = new Random();
        computerInput = r.nextInt(101);
    }

    public void UserInput(int userInput){
        this.userInput = userInput;
    }

    public void IsCorrect(){
        noOfGuess += 1;
        if (computerInput == userInput){
            System.out.println("Congratulations You Win!");
            System.out.println("You Win In "+noOfGuess+" Guess!");
        }

        else if (userInput > computerInput){
            System.out.println("Greater");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter New Number.");
            userInput = sc.nextInt();
            IsCorrect();
        }

        else{
            System.out.println("Lesser");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter New Number.");
            userInput = sc.nextInt();
            IsCorrect();
        }
    }
}

public class Guess_Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        System.out.println("Enter Your Number?");
        int n = sc.nextInt();
        g.UserInput(n);
        g.IsCorrect();
    }
}
