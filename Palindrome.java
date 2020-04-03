package com.palindrome.string;
import java.util.*;
/* This program that receives a word as an input from the user and checks if it is a 
palindrome: if it reads the same backward as forward. */
public class Palin {

    public static void main(String[] args) {

    	System.out.println("\n*********   Palindrome is or not?   *********\n");
    	Scanner sc = new Scanner(System.in);

    	System.out.println("\nEnter a word\n ");

    	String str = sc.nextLine();
    	String reverseStr = "";

    	for ( int i = str.lenght() - 1; i >= 0; i --) {
    		reverseStr = reverseStr + string.charAt(i);
    	}

        if (str.equals(reverseStr))
    	    System.out.println(string+" is a palindrome"); 

    	
        else 
            System.out.println(string+" is not a palindrome");
    
    }
}

