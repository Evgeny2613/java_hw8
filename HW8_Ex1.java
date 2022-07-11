/* Написать функцию, которая принимает на вход массив целых и заполняет его числами в обратном порядке
если передается массив длины 5, он заполняется значенями 5,4,3,2,1
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW8_Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array:");
        int array = input.nextInt();

        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int array){
        int [] creatingArray = new int[array];
        int number = array;
        for (int counter = 0; counter < array; counter++) {
            creatingArray[counter] = number;
            number--;
        }
        return creatingArray;
    }
}
