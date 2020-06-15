package com.company;
import java.util.Scanner;

public class Peter {
    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner screen = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = screen.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf + 1);// "Peter "
        //phrase= phrase - firstword
        char letter;
        int count = 0;
        for (int index = 0; index < firstword.length(); index++) {
            letter = firstword.charAt(index);
            if (letter != ' ') {

                count++;
                String temp = phrase.substring(index + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf > -1) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                firstword= firstword.replace(letter, ' ');
                System.out.println(letter + " " + count);
                count = 0;
                // find the rest of the letters in the message
               count= restProg(letter, phrase, count);
            }
        }
    }
    public static int restProg(char letter, String phrase, int count){
        // solve problem here
        return count;
    }
}