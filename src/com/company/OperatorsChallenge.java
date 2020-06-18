package com.company;
import java.util.Scanner;


public class OperatorsChallenge {

    static void solve (double mealCost, int tipPercent, int taxPercent){
        int tip= (int) (mealCost*tipPercent/100);
        int tax= (int) (mealCost*taxPercent/100);
        int totalCost= (int) (mealCost+tip+tax);
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


    }
    }

