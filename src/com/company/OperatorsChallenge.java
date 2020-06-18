package com.company;
import java.util.Scanner;

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

