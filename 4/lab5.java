/**
 * package: computer science 132
 * lab:     5: comparing loans
 * author:  Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class lab5
{
/**
 * Problem Description:
 * Write a program that lets the user enter the loan amount and loan period in number of years and displays the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8. Here is a sample run:
 *
 * <Output>
 * Loan Amount: 10000
 * Number of Years: 5
 * Interest Rate    Monthly Payment    Total Payment
 * 5%            188.71            11322.74
 * 5.125%        189.28            11357.13
 * 5.25%        189.85            11391.59
 * ...
 * 7.875%        202.17            12129.97
 * 8.0%            202.76            12165.83
 * <End output>
 */
private static String _formatRate     = "%.3f%13s";
private static String _formatCurrency = "%.2f%12s";
public static void main(String[] args)
{
    Scanner userInput    = new Scanner(System.in);
    System.out.print("Please enter the initial loan amount: ");
    double loanPrincipal = userInput.nextDouble();
    System.out.print("Please enter the loan term in years: ");
    int loanTerm         = userInput.nextInt();
    System.out.println("Interest Rate     Monthly Payment  Total Payment");
    for (double rate  = 5.0;
    rate             <= 8.0;
    rate             += (double) 1 / 8
    ) {
        /*
         * We convert the percentage annual interest rate to decimal format for
         * the math, and then divide by 12 to convert to monthly payments.
         *
         * We simply multiply by twelve to get the total number of montly
         * payments.
         *
         * reference:
         * https://en.wikipedia.org/wiki/Mortgage_calculator
         */
        double loanRate = rate / 100 / 12;
        int loanPaymentCount    = loanTerm * 12;
        double loanPayment      =
            (loanRate * loanPrincipal)
            / (1 - Math.pow(1 + loanRate, -1 * loanPaymentCount));
        loanPayment             = (int) (loanPayment * 100) / 100.0;
        /*
         * Now we can format the decimals to two or three decimal places as
         * necessary. The interest rate gets three. Currency gets two.
         */
        System.out.format(lab5._formatRate, rate, " ");
        System.out.format(lab5._formatCurrency, loanPayment, " ");
        System.out.format(lab5._formatCurrency, loanPayment * loanPaymentCount, " ");
        System.out.println();
    }
}
}
