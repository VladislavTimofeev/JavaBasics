package com.dmdev.tasks.cs.cycle;

/**
 * Написать программу, которая проходит циклом по английскому
 * алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
 * пока не встретит гласную (т.е. вывести согласные на консоль).
 */
public class CycleTask5 {
    public static void main(String[] args) {
        char startChar = 'b';
        printLetters(startChar);
    }

    private static void printLetters(char startChar) {
        for (char currentChar = startChar; !isVowel(currentChar); currentChar++) {
            System.out.println(currentChar);
        }
    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'y' || letter == 'o' || letter == 'i';
    }
}
