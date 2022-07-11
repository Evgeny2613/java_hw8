/* Напишите функцию, которая "переворачивает" передаваемый в нее массив,
 пример: [10,2,3333,4,5] -> [5,4,3333,2,10]
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW8_Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lengths of the array:");
        int arrayLengths = input.nextInt();
        int[] array = new int[arrayLengths];

        System.out.println("Enter the integers of the array (row by row):");
        for (int counter = 0; counter < arrayLengths; counter++) {
            array[counter] = input.nextInt();
        }

        System.out.println("The reverse array is: " + Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] array){
        int[] newArray = new int[array.length];
        int arrayLengths = array.length;
        for (int counterNew = 0; counterNew < array.length ; counterNew++) {
            arrayLengths--;
            newArray[counterNew] = array[arrayLengths];
        }
        return newArray;
    }
}
