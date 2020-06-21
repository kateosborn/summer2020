package com.company;
import java.util.Scanner;
public class GangstaName {
    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Type your name playa: ");
        String personName = Keyboard.nextLine();
        Challenge2.Top();
        System.out.print("Your gangsta name is:");
        gangstaName(personName);

    }

    public static void firstName(String personName) {
        int indexOf = personName.indexOf(" ");
        String firstName = personName.substring(0, indexOf);
        System.out.print(" " + firstName);
    }

    public static void lastname(String personName) {
        int indexOf = personName.indexOf(" ");
        if (indexOf > 0) {
            String lastname = personName.substring(indexOf);
            lastname = lastname.toUpperCase();
            System.out.print(lastname);

        }
    }

    public static void initial1(String personName) {
        char initial = personName.charAt(0);
        System.out.print(initial);
    }

    public static void gangstaName(String personName) {
        initial1(personName);
        System.out.print(". Diddy");
        lastname(personName);
        firstName(personName);
        System.out.print("-izzle");
    }
}
