package com.company;

import java.util.Random;
import java.util.Scanner;

/*
Kate Osborn

PseudoCode:
-import scanner
-create the scanner
-establish the varibles given (int s, double d, String s)
-create 3 new variables:
    - int, double, String
-Write the code so you can use your scanner to type out what you want (new integer, new double, new string)
 -Print the sum of int plus your int variable on a new line.
 - Print the sum of double plus your double variable to a scale of one decimal place on a new line.
- Concatenate string with the string you read as input and print the result on a new line.
- Write the line of code to add them together so they print!
 */
public class DataTypeChallenge {
    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        int i=4;
        double d=4.0;
        String s= "Greenhill has cool peacocks ";
        System.out.print("Type your integer! ");
        int myInt = screen.nextInt();
        System.out.print("Type your double! ");
        double doubly = screen.nextDouble();
        System.out.print ("Type your new string! ");
        String string1= screen.nextLine();


        int first= i + myInt;
        double second= d + doubly;
        String third= s + string1;

        System.out.printf( "\n %8.3s \n %10.5s \n %10.6s", first, second, s);

    }
}
