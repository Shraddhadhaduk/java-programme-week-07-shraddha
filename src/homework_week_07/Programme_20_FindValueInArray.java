package homework_week_07;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Programme_20_FindValueInArray {
    public static boolean contains(int[] array, int item){
        for(int n : array){
            if(item == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {13,27,89,65,45};
        System.out.println(contains(array1, 27));
        System.out.println(contains(array1, 39));
    }
}
