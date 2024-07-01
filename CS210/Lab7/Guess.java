// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess; //The user's guess
        int count = 1;
        int countHigh = 0;
        int countLow = 0;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        //randomly generate the number to guess
        numToGuess = generator.nextInt(10) + 1;
        //print message asking user to enter a guess
        System.out.println("Guess the number from 1 to 10: ");
        guess = scan.nextInt();
        //read in guess
        boolean checker = guess == numToGuess;
        while (!checker) //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong
            if(guess > numToGuess){
                System.out.println("Your guess was bigger than the number, try again: ");
                countHigh++;
            }else{
                System.out.println("Your guess was smaller than the number, try again: "); 
                countLow++;
            }
            //get another guess from the user
            guess = scan.nextInt();
            checker = guess == numToGuess;
            count++;
        } // end of loop
        //print message saying guess is right
        System.out.println("You guessed it! You had to guess " + count + " times.");
        System.out.println("You guessed too low " + countLow + " times.");
        System.out.println("You guessed too high " + countHigh + " times.");
    }//end of main
}// end of class
