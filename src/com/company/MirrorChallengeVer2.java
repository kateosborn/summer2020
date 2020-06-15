package com.company;
/*this is my first program
we are going to print a mirror using for loop
06/04/2020
This is my other line*/

public class MirrorChallengeVer2 {
public static final int SIZE=5;
    public static void main(String[] args) {
        Top();
        Middle();
        Bottom();
        Top();
        }

public static void Top(){
    System.out.print("#");
    //  control   increment
    for(int dash=0;dash <16; dash++) {
        System.out.print("=");
    }
    System.out.println("#");
}
public static void Middle (){
    for (int line = 1; line <=SIZE; line++) {
        System.out.print("|");
        for (int space = 1; space <=-2 * line + 8; space++) {
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int dots=1; dots<=4*line-SIZE; dots++) {
            System.out.print(".");
        }
        System.out.print("<>");
        for (int space = 1; space <=-2 * line + 8; space++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }


    }
    public static void Bottom (){
        for (int line = 1; line <=4; line++) {
            System.out.print("|");
            for (int space = 1; space <=2 * line -2; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots=1; dots<=-4*line+SIZE; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 1; space <=2 * line -SIZE/2; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

}

}
