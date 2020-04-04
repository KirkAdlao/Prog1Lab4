
import java.util.*;
/* This program that receives a word as an input from the user and checks if it is a 
palindrome: if it reads the same backward as forward. */
public class Palindrome {

    public static void main(String[] args) {

        boolean x = true;

        while (x = true) {

    	  System.out.println("\n*********   Palindrome is or not?   *********\n");
    	  Scanner sc = new Scanner(System.in);

    	  System.out.println("\nEnter a word:\n ");

    	  String str = sc.nextLine();
    	  String reverseStr = "";

          str = str.replace(" ", ""); 
          str = str.toLowerCase();
  
          //For methode used for limits

    	  for ( int i = str.length() - 1; i >= 0; i --) {
    		  reverseStr = reverseStr + str.charAt(i);
    	  }

          //If and else for exception whether its a palindrome or not
 
          if (str.equals(reverseStr))
    	     System.out.println(str + " is a palindrome\n"); 

    	
          else 
             System.out.println(str + " is not a palindrome\n");
        }
    
    }
}
