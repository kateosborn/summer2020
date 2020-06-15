package com.company;
/*this is my first program
we are going to print something
06/02/2020
This is my other line*/

public class MyFirstProgram {

    public static void main(String[] args) {
        String name= "kate";
        sayHi (name);
        Challenge2.Top();
        System.out.println("Hi "+ name);
        String student= "kate osborn is a student at greenhill";
        Challenge2.Top();
        sayHi (student);
        String letter = "I";
        Challenge2.Top();
        sayHi (letter);

    }
    public static void sayHi (String name) {
        name=name.toUpperCase();
        System.out.println("Hi " + name);
        int len= name.length();
        System.out.println("Your name is " + len + " characters long");
        int indexOf= name.indexOf("A");
        System.out.println("The letter A is at index " + indexOf);
        if (indexOf>0){
            String partial= name.substring(indexOf);
            System.out.println(partial);
        }
        if (name.length()>4) {
            char letter = name.charAt(4);
            System.out.println("the letter at index 4 is " + letter);
        }
    }



}