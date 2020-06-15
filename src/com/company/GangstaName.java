package com.company;
import java.util.Scanner;
public class GangstaName {
public static Scanner Keyboard=new Scanner (System.in);
    public static void main(String[] args) {
       System.out.print("Type your name playa: ");
       String fullName= Keyboard.nextLine();

}
public static void firstName (String personName){
        int indexofSpace= personName.indexOf(" ");
        String firstName= personName.substring(0,indexofSpace);
        System.out.print(" "+ firstName);
}
}