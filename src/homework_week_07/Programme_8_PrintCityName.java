package homework_week_07;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any alphabet from A-F ");
        char letter = scanner.next().charAt(0);
        printCity(letter);
        scanner.close();
    }
        public static void printCity (char letter1){
            if (letter1 == 'A' || letter1 == 'a') {
                System.out.println("Ahmedabad");
            } else if (letter1 == 'B' || letter1 == 'b') {
                System.out.println("Bengaluru");
            } else if (letter1 == 'C' || letter1 == 'c') {
                System.out.println("Chandigarh");
            } else if (letter1 == 'D' || letter1 == 'D') {
                System.out.println("Delhi");
            } else if (letter1 == 'E' || letter1 == 'e') {
                System.out.println("Elora");
            } else if (letter1 == 'F' || letter1 == 'f') {
                System.out.println("Faridabad");
            } else {
                System.out.println("Invalid entry");
            }
        }
    }
