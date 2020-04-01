import java.util.*;
import java.lang.String;
/* This program that receives a word as an input from the user and checks if it is a 
palindrome: if it reads the same backward as forward. */
public class Palin {

    public static void main(String[] args) {
    	System.out.println("\n*********   Palindrome is or not?   *********\n");

    	String str, rev = "";
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Enter a string:");
    	str = sc.nextLine();

    	int lenght = str.lenght();

    	for ( int i = lenght - 1; i >= 0; i --)
    		rev = rev + str.charAt(i);

    if(str.equals(rev))
    	System.out.println(str+" is a palindrome");
    else
       System.out.println(str+" is not a palindrome");

    }
}

