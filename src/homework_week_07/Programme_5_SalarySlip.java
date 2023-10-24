package homework_week_07;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme_5_SalarySlip {
    public static void main(String[] args) {

        salaryslip();
    }
    public static void salaryslip(){
        //int employeeld = 2564;
        //String employeeName = "jay
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee ID");
        int employeeld = scanner.nextInt();
        System.out.println("Enter the Employee name");
        String employeeName = scanner.next();
        System.out.println("Enter basic salary");
        int basicSalary = scanner.nextInt();
        scanner.close();


        double hra = basicSalary*10/100;
        int ta = basicSalary*8/100;
        int da = basicSalary*9/100;
        int pf = basicSalary*20/100;

        double grossSalary = basicSalary+hra+ta+da+pf;
        System.out.println("--------------");
        System.out.println("|       Salary Slip     |");
        System.out.println("|                       |");
        System.out.println("|--------------------|");
        System.out.println("| Employee ID : " + employeeld + "     |");
        System.out.println("| Employee Name : " + employeeName + "  |");
        System.out.println("| Basic Salary : " + basicSalary + "   |");
        System.out.println("| HRA    : " + hra + "  |");
        System.out.println("| TA 8%  : " + ta + "   |");
        System.out.println("| DA 9%  : " + da + "   |");
        System.out.println("| PF -20&  : " + pf + " |");
        System.out.println("| Gross Salary : " + grossSalary + "   |");
        System.out.println("|-----------------------|");
        System.out.println("|==========================|");

    }


}
