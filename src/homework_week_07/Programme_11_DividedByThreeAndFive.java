package homework_week_07;

/**
 * 11.Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Programme_11_DividedByThreeAndFive {
    public static void main(String[] args) {
      //print numbers divided by 3

        System.out.print("\nDivided by 3 : ");
        for (int i = 1; i < 100; i++){
            if (i % 3 == 0)
                System.out.println(i + " , ");
        }

      // print numbers divided by 5
        System.out.print("\n\nDivided by 5 :");
        for (int i = 1; i < 100; i++){
            if (i % 5 == 0)
                System.out.println(i + " , ");
        }
        //print numbers divided by both 3 and 5
        System.out.print("n\nDivided by 3 & 5 : ");
        for (int i = 1; i < 100; i++){
            if ( i % 3 == 0 && i % 5 == 0)
                System.out.println(i + " , ");
        }
        System.out.print("\n");


    }

}
