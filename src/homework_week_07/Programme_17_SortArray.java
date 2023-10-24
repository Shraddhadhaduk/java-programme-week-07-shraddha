package homework_week_07;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {
    public static void main(String[] args) {
        //Approach 1
        int[] array1 = { 3,2,7,9,1,10};

        //Approach 2
        String[] array2 = {"Java","Python","C++","PHP"};

        System.out.println("Original numeric array : " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("sorted numeric array : " + Arrays.toString(array1));

        System.out.println("Original string array : " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("sorted string array : " + Arrays.toString(array2));

    }

}
