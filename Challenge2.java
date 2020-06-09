package com.company;


public class Challenge2 {
    public static final int SIZE=5;
    public static void main(String[] args) {
    Top ();
    Middle();
    Bottom();
    Top ();
    Bottom ();
    Middle ();
    Top ();
}

    public static void Top() {
        /*this for loop prints the top line, the dividing line as
         well as the bottom line by first printing a plus and then
         the nine dashes that follow.
         */
        System.out.print("+");
        for (int dash=1; dash <= 2 *SIZE +1; dash ++){
            System.out.print ("-");
        }
        System.out.println("+");
    }




    public static void Middle () {
        /* this loop is for the top triangle. it starts by printing the vertical dashes
        and then the spaces. i then created another loop to print the forward slashes and then
        the star (not included in the loop). i then copied the previous loop to print the vertical dashes
        and space.

         */
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= SIZE-line+1; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= 1 * line -1; slash ++){
                System.out.print("/");
            }
            System.out.print ("*");
            for (int slash = 1; slash <= 1 * line -1; slash ++){
                System.out.print("\\");
            }
            for (int space = 1; space <= SIZE-line+1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Bottom (){
        /*
        this loop prints the bottom triangle. all i did here was copy and paste the previous one but change
        some of the equations.
         */
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= SIZE-line; slash ++){
                System.out.print("\\");
            }
            System.out.print ("*");
            for (int slash = 1; slash <= SIZE-line; slash ++){
                System.out.print("/");
            }
            for (int space = 1; space <= line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}





