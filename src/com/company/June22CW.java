package com.company;
/*
Kate Osborn
PseduoCode:
Import and create scanner
Import and create random
Prompt user for number of days
    Print "How many day's temperatures?"
define int days as answer
Create user control while loop for when it doesn't satisfy
redefine days as answer
create new array weather to store daily temps
initialize variable sum as 0
initialize variable average as 0
initialize variable counter as 0
Create random randy bounded from 25 to 110 inclusive
Create for loop controlled by days and initialize i as 0
    a = i + 1
    Println: Day a's high temp is: + randy
    sum = sum + randy
    average = sum/a
    if randy > average
        counter = counter+1
Println average temp = average
Println counter days were above average 

 */
import java.util.*;
public class June22CW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randy = new Random();
        System.out.println("How many days do you want to input? ");
        int days = input.nextInt();
        while (days <= 2 || days > 100) {
            System.out.println("Your number is not between 2 and 100 inclusive, try again");
            days = input.nextInt();
        }
        int[] weather = new int[days];
        int sum = 0;
        double average = 0;
        int counter = 0;
        int a;
        for (int i = 0; i < days; i++) {
            a = i + 1;
            weather[i] = randy.nextInt(85) + 25;
            System.out.println("Day" + a + " 's high temp is " + weather[i] + ".");
            sum = sum + weather[i];
        }
        average = (double) sum / days;
        System.out.println("The average temp is: "+ average);
        int count = 0;
        for (int i = 0; i<days; i++){
            if (weather[i] > average) {
                count = count + 1;
            }
        }
        System.out.println(count+" days were above average");

    }


    }
