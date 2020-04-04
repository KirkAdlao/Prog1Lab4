import java.util.Scanner;
import java.io.*;
/* This program is one of the questions in the book. It shows us how to 
calcualte an average test score*/
public class AverageTestScore {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int total = 0;
        final int SENTINEL = -1;
        int score;

        System.out.println("\n****************************************");
        System.out.println("*********  Average Test Score  *********");
        System.out.println("****************************************\n");

        System.out.println(" Calculate a class average test score, ");
        System.out.println(" Please enter each test score.");
        System.out.println(" When you are finished, enter a -1");

        System.out.println(" Enter the first test score > " );
        score = sc.nextInt();

        while ( score != SENTINEL ) 
        {
        	total += score;
        	count++;

        	System.out.println(" Enter the next test score > ");
        	score = sc.nextInt();
        }

        if ( count != 0 )
        {
        	DecimalFormat oneDecimalPlace = new DecimalFormat("0.0");
        	System.out.println("\nThe class average is "
        	                   + oneDecimalPlace.format( (double) (total)/ count));
        } 
        else 
        	System.out.println("\nNo grades were entered ");
    }
}


        
        
