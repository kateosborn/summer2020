package com.company;

public class Reciept {

    public static void main(String[] args) {
double dish1= 38;
double dish2=40;
double dish3=30;
double sub=dish1+dish2+dish3 ;
final double tax = 0.08;
final double tip = .15;
double finalprice= sub+sub*tax+sub*tip;
double finalTax= sub * tax;
double finalTip= sub * tip;



        // Calculate total owed, assuming 8% tax / 15% tip

        System.out.println("Subtotal:");
        System.out.println(sub);
        System.out.println("Tax:");
        System.out.println(finalTax);
        System.out.println("Tip:");
        System.out.println(finalTip);
        Challenge2.Top();
        System.out.println("Total:");
        System.out.println(finalprice);

    }

}