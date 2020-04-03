import java.util.*;
import java.util.Random;
/* This program that generates a random number between 0 and 100 and asks the user 
to guess it. The user can have at maximum 10 trials.*/
public class Guess {


    public static void main(String[] args) {

    	//delclaring my variables
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); 
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        //Used a while method so the user can have at least 10 tries.

        while (win == false) {

           System.out.println("\n**************************************");
           System.out.println("*********                    *********");
           System.out.println("*********  Guess the Number  *********");
           System.out.println("*********                    *********");
           System.out.println("**************************************");
           System.out.println("                                      ");

           //Asking the user to answer a number between 1 to 100.

           System.out.println("\nI am thinking of a number from 1 to 100 ... guess what it is ?\n");

           //more variables
           
           guess = sc.nextInt();
           numberOfTries++;

           //Using an if method for conditions

           if (guess == numberToGuess) {
           	   win = true;
           }

           else if (guess < numberToGuess) {
           	System.out.println("\n Your guess is too low ");
           }

           else if (guess > numberToGuess) {
           	System.out.println("\n Your guess is to high ");
           }

           //Output message if all tries were used if conditions were met 

           if (numberOfTries > 10 ) {
           	System.out.println("\n Unlucky... You used all of your tries. ");
           }

        }

        //Output message if winner

        System.out.println(" You Win!");
        System.out.println(" The number was " + numberToGuess);
        System.out.println(" It took you " + numberOfTries + " tries.");
    }
}


       
