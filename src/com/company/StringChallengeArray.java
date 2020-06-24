package com.company;
import java.util.Scanner;

/*
Kate Osborn
PseudoCode:
-import scanner
-create scanner
-create constraints for the user input strings on how long it can be
-Create a loop for how many strings
-Use the scanner for user input of each string
-Find the even and odd indexes with %==1/%==0
-print even and odds separately by a space
 */
public class StringChallengeArray {


    public static void main(String[] args) {
        int numOfString;
        Scanner screen = new Scanner(System.in);
        do {
            System.out.println("How many strings would you like to input? ");
            numOfString = screen.nextInt();
        } while (numOfString < 1 || numOfString > 10);
        String[] array1 = new String[numOfString];
        //this is to establish and collect data for how many strings are going to be inputted

        for (int loop = 0; loop <numOfString; loop++) {
            do {
                System.out.println("Enter a string: ");
                array1[loop] = screen.next();
            } while (array1[loop].length() < 2 || array1[loop].length() > 10000);
            array1[loop] = output(array1[loop]);
        }


        for (int wordCount = 0; wordCount < numOfString; wordCount++) {
            System.out.println(array1[wordCount]);
            //this for loop prints my code

        }
    }

    public static String output(String stringInput) {
        String evenString = "";
        String oddString = "";

        int stringLength = stringInput.length();

        for (int evenChars = 0; evenChars < stringLength; evenChars += 2) {
            char outputChar = stringInput.charAt(evenChars);
            evenString = evenString + outputChar;// this for loop prints and establishes the even chars
        }
        for (int oddChars = 1; oddChars < stringLength; oddChars += 2) {
            char outputChar = stringInput.charAt(oddChars);
            oddString = oddString + outputChar;// this for loops prints and establishes the odd chars
        }
        stringInput = evenString + " " + oddString;
        return stringInput;


    }
}



