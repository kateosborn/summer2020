package com.company;

public class KShapeChallenge {
    public static final int SIZE = 6;

    public static void main(String[] args) {
char letter= 65;
for (int line=SIZE; line>0;line--) {
    for (int let=0; let<line;let++){
        System.out.print((char)(letter+let)+" ");
                System.out.print(" ");
    }
    System.out.println();
}
for (int line2=0; line2<SIZE; line2 ++){
    for (int let=0; let< line2; let++){
        System.out.print((char)(letter+let)+" ");
    }
    System.out.println();
}

}
}




