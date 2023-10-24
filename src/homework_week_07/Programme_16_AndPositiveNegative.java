package homework_week_07;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16_AndPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scanner.nextInt();
        scanner.close();

        if (n > 0){
            System.out.println("Number is Positive");
        }else if (n < 0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }

}
