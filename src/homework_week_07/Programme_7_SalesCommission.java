package homework_week_07;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        salesCommision();
    }
    public static void salesCommision(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sales id");
        int salesId = scanner.nextInt();
        System.out.println("Enter the seller's name");
        String sellerName = scanner.next();
        System.out.println("Enter the sales Amount");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter the Salary Basic");
        int salaryBasic = scanner.nextInt();
        scanner.close();

        if(salesAmount >= 50000){
            System.out.println("35%" + salesAmount*35/100);
        }else if (salesAmount >= 30000){
            System.out.println("20%" + salesAmount*20/100);
        }else if (salesAmount >= 20000){
            System.out.println("10%" + salesAmount*10/100);
        }else if (salesAmount >= 10000){
            System.out.println("5%" + salesAmount*5/100);
        }else{
            System.out.println("2%" + salesAmount*2/100);
        }
    }
}
