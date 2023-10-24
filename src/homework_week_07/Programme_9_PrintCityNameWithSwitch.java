package homework_week_07;

import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement.
 */
public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any alphabet from A-F");
        char letter = scanner.next().charAt(0);
        printCity(letter);
        scanner.close();
    }
    public static void printCity(char letter1){
        switch (letter1){
            case 'A' :
                System.out.println("Ahmedabad");
                break;
            case 'B' :
                System.out.println("Bengaluru");
                break;
            case 'C' :
                System.out.println("Chandigarh");
                break;
            case 'D' :
                System.out.println("Delhi");
                break;
            case 'E' :
                System.out.println("Elora");
                break;
            case 'F' :
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
