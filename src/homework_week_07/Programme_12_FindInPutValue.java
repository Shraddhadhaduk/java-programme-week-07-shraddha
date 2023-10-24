package homework_week_07;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindInPutValue {
    //Method to check if a character is an alphabet

    public static boolean isAlphabet(char c){
        return Character.isLetter(c);
    }
    //Method to check if A character is a number
    public static boolean isNumber(char c){
        return Character.isDigit(c);
    }
    //Method to check if a character is a symbol (non-alphabet, non-number)
    public static boolean isSymbol(char c){
        return !isAlphabet(c) && !isNumber(c);
    }

    public static void main(String[] args) {
        //User enters desired value such as a number, an alphabet or a symbol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char input = scanner.next().charAt(0);
        if(isAlphabet(input)){
            System.out.println("The input is an alphabet");
        }else if  (isNumber(input)){
            System.out.println("The input is a number");
        }else if (isSymbol(input)){
            System.out.println("The input is a symbol");
        }else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
