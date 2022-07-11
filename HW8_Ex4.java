/*
Напишите функцию,
которая возвращает массив из символов передаваемой в нее строки,
пример: "Петя" -> ['П', 'е', 'т', 'я']
 */

import java.util.Arrays;
import java.util.Scanner;

public class HW8_Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word:");
        String word = input.nextLine();

        System.out.println("The array is: " + Arrays.toString(arrayOfSymbols(word)));
    }

    public static char[] arrayOfSymbols(String word){
        int wordLengths = word.length();
        char[] array = new char[wordLengths];

        for (int counter = 0; counter < wordLengths; counter++) {
            array[counter] = word.charAt(counter);
        }
        return array;
    }
}
