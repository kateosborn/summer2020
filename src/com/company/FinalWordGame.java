package com.company;
import java.io.*;
import java.util.*;
/*
Kate Osborn
PseudoCode:
-import java.io.* and java.util.*
-create file with 20 different tokens per line (400 total)
    words: colors
    integers:100-999
    doubles: 1.00-10.00
-import scanner
-create the fun welcome sign! (extra credit)
-ask the user if they want to guess a word, double, or int
-create a series of if, else if statements that allow the user to type in what they want per category
and then contribute to the score
-create methods for each of the categories(colors, animals ints, doubs)
    -allow the user to type in their guess
    -if its correct score++ and print that is correct
    -if incorrect score decreases :(
-prompt the user if they want to play again
    -if they do, the loop will then come back and ask if they want to guess a color, animial, int, or doub
    -once they do not want to play print the score and the amount of times played (ie score was 1/10)
 */
public class FinalWordGame {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(" __          __  _ ");
        System.out.println(" \\ \\        / / | |");
        System.out.println("  \\ \\  /\\  / /__| | ___  ___  _ __ ___   ___");
        System.out.println("   \\ \\/  \\/ / _ \\ |/    /   \\ | '_` _ \\ /   \\");
        System.out.println("    \\  /\\  /  __/ | (_| (_) | | | | | |  __/");
        System.out.println("     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|");
        String playAgain;
        int Score = 0;
        int playCounter=0;
        do {
            File file = new File("/Users/kateosborn/IdeaProjects/summer2020/src/com/company/FinalProject.txt");
            Scanner fileInput = new Scanner(file);
            playCounter++;
            System.out.println("Would you like to guess a color or animal, integer, or double");
            String userChoice = userInput.next();
            if (userChoice.equals("color")) {
                Score = colors(Score, fileInput);
            } else if (userChoice.equals("integer")) {
                Score = integers(Score, fileInput);
            } else if (userChoice.equals("double")) {
                Score = doubles(Score, fileInput);
            }else if (userChoice.equals("animal")){
                Score= animals(Score, fileInput);
            }

            System.out.println("Do you want to play again. Yes or No");
            playAgain = userInput.next();
            playAgain = playAgain.toLowerCase();
            fileInput.close();
        } while (playAgain.equals("yes"));
        System.out.println("Your score was " + Score + " out of " + playCounter + ", thanks for playing!");


    }

    public static int colors(int Score, Scanner fileInput) {
        System.out.println("Guess a color: ");
        String userGuess = userInput.next();

        boolean flag = false;
        while (fileInput.hasNextLine()) {
            if (fileInput.hasNext()) {
                if (fileInput.next().equals(userGuess)) {
                    Score++;
                    System.out.println("That is correct!");
                    break;
                }
            }
        }
        return Score;
    }
    public static int animals (int Score, Scanner fileInput) {
        System.out.println("Guess an animal: ");
        String userGuess = userInput.next();

        boolean flag = false;
        while (fileInput.hasNextLine()) {
            if (fileInput.hasNext()) {
                if (fileInput.next().equals(userGuess)) {
                    Score++;
                    System.out.println("That is correct!");
                    break;
                }
            }
        }
        return Score;
    }

    public static int integers(int Score, Scanner fileInput) {
        System.out.println("Guess a 3 digit integer: ");
        int userGuess = userInput.nextInt();
        boolean flag = false;
        while (fileInput.hasNextLine()) {
            if (fileInput.hasNextInt()) {
                if (fileInput.nextInt() == (userGuess)) {
                    Score++;
                    System.out.println("That is correct!");
                    break;
                }
            } else {
                String trash = fileInput.next();
                flag = false;
            }

        }
        return Score;
    }

    public static int doubles(int Score, Scanner fileInput) {
        System.out.println("Guess a 2 decimal number between 1 and 10: ");
        double userGuess = userInput.nextDouble();
        userGuess=(((int)(userGuess*1000))/100.0);
        boolean flag = false;
        flag = false;
        while (fileInput.hasNextLine()) {
            if (fileInput.hasNextDouble()) {
                if (fileInput.nextDouble() == (userGuess)) {
                    Score++;
                    System.out.println("That is correct!");
                    break;
                }
            } else {
                String trash = fileInput.next();
                flag = false;
            }
        }
        return Score;
    }
}



