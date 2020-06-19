package com.company;
import java.util.Scanner;
/*
Kate Osborn

PseduoCode:
-Import scanner
-Create scanner
-Make the static void to solve
-In the static void state the calcutions being used for ti[ and tax and total cost
-Write a print statement to print total cost
-Create the main void (the scanner is here)
-Write print line to print the statement meal cost
-Write scanner statement so user can type in any double they want
-Repeat the following 2 steps but for tax and tip
-Write the statement for the computer to solve the total cost
 */
public class OperatorsChallenge {

    static void solve(double mealCost,int tipPercent, int taxPercent){
        double tip= (mealCost*tipPercent/100);
        double tax= (mealCost*taxPercent/100);
        double totalCost= (mealCost+tip+tax);
        totalCost=(int)totalCost;
        System.out.println("Total cost: "+ totalCost);

    }

    public static void main(String[] args) {

        Scanner screen = new Scanner(System.in);
        System.out.println("Meal cost: ");
        double mealCost= screen.nextDouble();
        System.out.println("Tip percent: ");
        int tipPercent= screen.nextInt();
        System.out.println("Tax percent : ");
        int taxPercent = screen.nextInt();
        solve(mealCost,tipPercent,taxPercent);

    }
    }

