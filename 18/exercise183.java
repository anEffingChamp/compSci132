/**
 * package:  computer science 132
 * exercise: 18.3 greatest common divisor with recusion
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise183
{
public static void main(String[] args)
{
    Scanner userScanner = new Scanner(System.in);
    System.out.println("Please enter two integers: ");
    int firstValue      = userScanner.nextInt();
    int secondValue     = userScanner.nextInt();
    System.out.println(
        "The greatest common divisor is "
        + exercise183.gcd(firstValue, secondValue)
    );
}
static double gcd(double m, double n)
{
    if (0 == m % n) {
        return n;
    }
    return exercise183.gcd(n, m % n);
}
}
