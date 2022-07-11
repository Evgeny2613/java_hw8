/*
Напишите функцию, которая принимает на вход массив
 и заменяет в нем все отрицательные элементы на их абсолютные значения
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW8_Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lengths of the array:");
        int arrayLengths = input.nextInt();
        int[] array = new int[arrayLengths];

        System.out.println("Enter the integers of the array (row by row):");
        for (int counter = 0; counter < arrayLengths; counter++) {
            array[counter] = input.nextInt();
        }

        System.out.println("The array is: " + Arrays.toString(absoluteValues(array)));
    }

    public static int[] absoluteValues(int[] array){
        for (int counter = 0; counter < array.length; counter++) {
            if(array[counter] < 0)
                array[counter] = Math.abs(array[counter]);
        }
        return array;
    }
}
