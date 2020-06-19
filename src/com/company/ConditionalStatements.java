package com.company;
import java.util.Random;
import java.util.Scanner;
/*
Kate Osborn

PseudoCode:
-Import scanner
-Create scanner
-Create varible for n (int n= 1-137)
-In the do while create a series of if, else if statements so that if its odd or inbeetween 6-20 "weird" is printed
and ever or 2-5 "not weird" is printed
-Make is so that is asks the user if they want to quit and when no is stated it keeps running
 */

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner screen = new Scanner(System.in);
        Random myInt = new Random();
        String answer;
        do {
            int number1 = myInt.nextInt(137) + 1;
            System.out.println(number1);
            statements(number1);
            System.out.print("Do you want to quit? (Yes/No): ");
            answer = screen.next();
        }
        while (answer.equals("no"));
    }
    public static void statements(int number1){
        if (number1 % 2==1) {
            System.out.println("Weird");
        }
        else if (number1 % 2==0 && number1>2 && number1<5) {
            System.out.println("Not weird");
        }
        else if (number1 % 2==0 && number1>6 && number1 <20) {
            System.out.println("Weird");
        }
        else if (number1 % 2 ==0 && number1>20){
            System.out.println("Not weird");
        }





        }
    }






