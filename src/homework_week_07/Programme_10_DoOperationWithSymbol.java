package homework_week_07;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scanner.nextInt();
        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        System.out.println("Choose and enter the type of operation you want to perform (+, -, /, *) - ");
        char operation = scanner.next().charAt(0);
        solve(a, b, operation);
        scanner.close();
    }

    public static int solve(int a, int b, char operation) {
        int ans = 0;
            // addition
        if (operation == '+') {
            ans = a + b;
            // subtraction
        } else if (operation == '-') {
            ans = a - b;
            //division
        } else if (operation == '/') {
            ans = a / b;
            //multiplication
        } else if (operation == '*') {
            ans = a * b;
        }
        //printing final result
        System.out.println("Your answer is - " + ans);
        return ans;
    }
}
