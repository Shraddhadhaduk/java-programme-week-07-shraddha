package homework_week_07;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme_19_AverageOfArray {
    public static void main(String[] args) {

        int[] numbers = new int[]{5, 7, 4, 9, 13};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);

    }
}
