package com.company;
import java.util.Scanner;

public class June15Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            double doubly1 = 123.456;
            double doubly2 = 456.789;
            double doubly3 = 789.123;
            int num1 = (int) Math.sqrt(420);
            int num2 = (int) Math.abs(-50.78);
            int num3 = (int) Math.round(9.876);


            System.out.printf("using printf \n %5.3f  \n %5.3f \n %5.3f " +
                    "\n %3d \n %3d \n %3d", doubly1, doubly2, doubly3, num1, num2, num3);


    }
}


