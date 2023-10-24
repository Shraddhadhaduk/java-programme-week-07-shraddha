package homework_week_07;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Programme_3_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = scanner.nextLine();
        System.out.println("Enter roll number");
        int rollNo = scanner.nextInt();
        //Input marks for math, Science and English
        System.out.println("Enter math marks (0-100):");
        int mathMarks = scanner.nextInt();
        System.out.println("Enter science marks (0-100):");
        int scienceMarks = scanner.nextInt();
        System.out.println("Enter english marks (0-100):");
        int englishMarks = scanner.nextInt();
        scanner.close();

        //Check if marks are in the valid range
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100 ){
            System.out.println(" Invalid input. Marks should be between 0 to 100 ");
        }else {
            //Calculate total and percentage
            int totalMarks = mathMarks + scienceMarks + englishMarks;
            double percentage = (totalMarks / 300.0 ) * 100;
            //Determine pass or fail
            String result = (percentage >= 35) ? "Pass" : "Fail";
            String grade;
            if  (percentage >= 80){
                grade = "A+";
            }else if (percentage >= 60){
                grade = "A";
            }else if (percentage >= 50){
                grade = "B";
            }else if (percentage >= 35){
                grade = "C";
            }else {
                grade = "D";
            }
            //print the mark sheet
            System.out.println("--------------------------------------------");
            System.out.println("|                                          |");
            System.out.println("|               Mark Sheet                 |");
            System.out.println("--------------------------------------------");
            System.out.println("| Name : " + name + "                      |");
            System.out.println("| Roll No : " + rollNo + "                 |");
            System.out.println("--------------------------------------------");
            System.out.println("| Subject : Marks                          |");
            System.out.println("|-------------------------------------------");
            System.out.println("| Math : " + mathMarks + "                 |");
            System.out.println("| Science : " + scienceMarks + "           |");
            System.out.println("| English : " + englishMarks + "           |");
            System.out.println("-------------------------------------------|");
            System.out.println("| Total : " + totalMarks + "               |");
            System.out.println("|------------------------------------------|");
            System.out.println("| Percentage : " + percentage + "          |");
            System.out.println("| Result : " + result + "                  |");
            System.out.println("| Grade : " + grade + "                    |");
            }
    }

}
