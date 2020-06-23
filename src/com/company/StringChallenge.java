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
public class StringChallenge {



    public static void main(String[] args) {
        int numOfString;
        Scanner screen = new Scanner(System.in);
        do {
            System.out.println("How many strings would you like to input? ");
            numOfString = screen.nextInt();
        }while (numOfString<1 || numOfString>10);

    for(int loop=0; loop <=numOfString; loop ++);
    System.out.println("Enter a string: ");
    String stringInput= screen.next();
    String recieveWord=output(stringInput);
    System.out.println(recieveWord);
    }
  public static String output (String stringInput){
        String evenString="";
        String oddString="";
        String finalOutput= " ";
        int stringLength= stringInput.length();
        stringLength=stringLength-1;
        for (int evenChars=0; evenChars<= stringLength; evenChars+=2){
            char outputChar= stringInput.charAt(evenChars);
            evenString=evenString+outputChar;
        }
        for (int oddChars = 1; oddChars<=stringLength; oddChars+=2) {
            char outputChar = stringInput.charAt(oddChars);
            oddString = oddString + outputChar;
        }
        stringInput= evenString+" "+oddString;
        return stringInput;



}
}




