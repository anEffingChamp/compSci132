/**
 * package:  computer science 132
 * exercise: 2.7: finding number of years
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise27
{
private static int minutesPerDay = 60 * 24;
private static int daysPerYear   = 365;
/**
 * This program calculates the number of years, and days that correspond to a
 * given number of input minutes.
 */
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number of minutes: ");
    int minutes   = input.nextInt();
    int days      = minutes / exercise27.minutesPerDay;
    int years     = 0;
    if (365 < days) {
        years = days / exercise27.daysPerYear;
        days -= years * exercise27.daysPerYear;
    }
    System.out.println(
        minutes + " minutes is approximately "
        + years + " years and "
        + days + " days"
    );
}
}
