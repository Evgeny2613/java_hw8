// Напишите функцию, которая проверяет,
// есть ли в передаваемом в нее массиве отрицаетльные элементы - возвращает boolean

import java.util.Scanner;

public class HW8_Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lengths of the array:");
        int lengthsOfArray = input.nextInt();

        int[] array = new int[lengthsOfArray];

        System.out.println("Enter the integers of the array:");

        for (int counter = 0; counter < lengthsOfArray; counter++) {
            array[counter] = input.nextInt();
        }

        boolean result = ifNegativeNumbers(array);
        if (result == true)
            System.out.println("No negative value in the array");
        else
            System.out.println("Negative value is present in the array");
    }

    public static boolean ifNegativeNumbers(int [] array){
        boolean result = true;
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] < 0) {
                result = false;
                break;
            }
            else
                result = true;
        }
        return result;
    }
}
