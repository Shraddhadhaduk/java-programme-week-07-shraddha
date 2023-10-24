package homework_week_07;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme_18_SumOfArray {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int sum = 0;

        for (int i : array)
            sum += i;
        System.out.println(" The sum is " + sum);
    }

}
