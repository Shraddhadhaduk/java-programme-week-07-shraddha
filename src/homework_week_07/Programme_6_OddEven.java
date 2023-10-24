package homework_week_07;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6_OddEven {
    public static void main(String[] args) {
        oddOrEven();
    }
    public static void oddOrEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println(+ number + " = is even number" );
        }else{
            System.out.println(+ number + " = is odd number");
        scanner.close();
        }
    }
}
