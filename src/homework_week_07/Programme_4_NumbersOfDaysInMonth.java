package homework_week_07;

import java.util.Scanner;

/**
 * 4. Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 *
 * Example of input/Output:
 * ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
 * ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 * year.
 * ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 * 2018 is not a leap year.
 * ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
 * ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 * 9999
 * HINT: Use the switch statement.
 * NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 */
public class Programme_4_NumbersOfDaysInMonth {

    public static void main(String[] args) {
        int DayInMonth = 0;
        String NameOfMonth = "Unknow";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        System.out.println("Day in Month");
        int month = scanner.nextInt();
        scanner.close();

        switch (month) {
            case 1:
                DayInMonth = 31;
                NameOfMonth = " January";
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    DayInMonth = 29;
                } else {
                    DayInMonth = 28;
                }                //every for year 29 days/
                    NameOfMonth = " February";
                break;
            case 3:
                DayInMonth = 31;
                NameOfMonth = " March";
                break;
            case 4:
                DayInMonth = 30;
                NameOfMonth = "April";
                break;
            case 5:
                DayInMonth = 31;
                NameOfMonth = "May";
                break;
            case 6:
                DayInMonth = 30;
                NameOfMonth = "June";
                break;
            case 7:
                DayInMonth = 31;
                NameOfMonth = "July";
                break;
            case 8:
                DayInMonth = 31;
                NameOfMonth = "August";
                break;
            case 9:
                DayInMonth = 30;
                NameOfMonth = "september";
                break;
            case 10:
                DayInMonth = 31;
                NameOfMonth = "October";
                break;
            case 11:
                DayInMonth = 30;
                NameOfMonth = "November";
                break;
            case 12:
                DayInMonth = 31;
                NameOfMonth = "December";
        }

        System.out.print(NameOfMonth+ " "+   year  +  " has  "  +DayInMonth + " day\n" );


    }

}