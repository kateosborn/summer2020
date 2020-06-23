package com.company;
import java.util.*;

/*
Kate Osborn
PseudoCode:
-import java.util
-create a new random for array size 5-10
-create variable "size" to put in array1 size
-create for loop controlled by random size
            make new array controlled by random size
            create new random for array elements
-make new array controlled by random size
-create new random for array elements
-create method to send 2 indexes for swapping
-return

 */
public class June23CW {
    public static void main(String[] args) {
        Random randy1 = new Random();
        int size = randy1.nextInt(5) + 5;
        int[] array1 = new int[size];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = randy1.nextInt(90) + 10;
        }

        int index1;
        int index2;
        do {
            index1 = randy1.nextInt(size);
            index2 = randy1.nextInt(size);
        } while (index1 == index2);

        System.out.println(Arrays.toString(array1));
        array1=swap(array1,index1,index2);
        System.out.println(Arrays.toString(array1));
    }
    public static int [] swap(int[] array, int num1, int num2){
        int temp=array[num1];
        array[num1]=array[num2];
        array [num2]=temp;

        return array;
    }
}
