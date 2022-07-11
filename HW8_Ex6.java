/* Напишите функцию, которая принимает на вход шестнадцатиричное число в виде строки
 и возвращает строку в виде двоичных чисел. Пример "1abc" -> "0001 1010 1011 1100"
 */

import java.util.Scanner;

public class HW8_Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the line:");
        String line = input.nextLine();

        System.out.println("The values is: " + hexadecimalToBinary(line));
    }

    public static String hexadecimalToBinary(String line) {
        String value;
        String finalNumber = "";
        for (int counter = 0; counter < line.length(); counter++) {
            if (line.charAt(counter) == '0') {
                value = "0000";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '1') {
                value = "0001";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '2') {
                value = "0010";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '3') {
                value = "0011";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '4') {
                value = "0100";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '5') {
                value = "0101";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '6') {
                value = "0110";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '7') {
                value = "0111";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '8') {
                value = "1000";
                finalNumber += value + " ";
            } else if (line.charAt(counter) == '9') {
                value = "1001";
                finalNumber += value + " ";
            } else if (line.toLowerCase().charAt(counter) == 'a') {
                value = "1010";
                finalNumber += value + " ";
            } else if (line.toLowerCase().charAt(counter) == 'b') {
                value = "1011";
                finalNumber += value + " ";
            } else if (line.toLowerCase().charAt(counter) == 'c') {
                value = "1100";
                finalNumber += value + " ";
            } else if (line.toLowerCase().charAt(counter) == 'd') {
                value = "1101";
                finalNumber += value + " ";
            } else if (line.toLowerCase().charAt(counter) == 'e') {
                value = "1110";
                finalNumber += value + " ";
            } else if (line.toLowerCase().charAt(counter) == 'f') {
                value = "1111";
                finalNumber += value + " ";
            }

        }
        return finalNumber;
    }
}
