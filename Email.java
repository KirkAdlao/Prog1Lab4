import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* This program to validate email addresses. Use a loop to go over each character, 
and find an @ sign, followed by two or more words separated by dots */
public class Email {

    public static void main(String[] args) {

    	System.out.println("\n*********   Email Validator   *********\n");

    	Scanner sc = new Scanner(System.in);
    	String email = sc.nextLine();

    	System.out.println(valEmail(email));
    	  
        }

        public static boolean valEmail (String input) {

         //A regular expression is a special sequence of characters that helps you match or 
         //find other strings or sets of strings, using a specialized syntax held in a pattern. 

    	  String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    	  Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
    	  Matcher matcher = emailPat.matcher(input);
    	  return matcher.find();
       }
    }



