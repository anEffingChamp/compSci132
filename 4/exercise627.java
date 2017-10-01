/**
 * package:  computer science 132
 * exercise: 6.27: Emirp
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise627
{
/**
 * This program finds corresponding emirps. It displays the first 100 emirps in
 * a console with ten numbers to each line. The function starts with 11 as the
 * smallest two digit prime, and increments accordingly. 10 can not be prime.
 *
 * reference:
 * https://en.wikipedia.org/wiki/Emirp
 */
private static int _count           = 0;
private static String _outputFormat = "%5d ";
public static void main(String[] args)
{
    double value        = 11.0;
    int loopCount       = 0;
    String outputFormat = exercise627._outputFormat;
    while (100 > exercise627._count) {
        // TODO Are we required to display the values in numeric order? The
        // problem never specifies.
        if (true == exercise627.isPrime(value)) {
            double valueReverse = exercise627.isEmirp(value);
            if (0     != valueReverse
            &&  value < valueReverse
            ) {
                loopCount++;
                System.out.format(outputFormat, (int) value);
                System.out.format(outputFormat, (int) valueReverse);
                if (0 == loopCount % 10) {
                    System.out.println();
                }
                exercise627._count++;
            }
        }
        value += 2;
    }
}
/**
 * isPrime() determines whether an input is a prime number. Its input must be a
 * double for accurate division.
 */
public static boolean isPrime(double input) {
    boolean output = true;
    if (0 == input % 2) {
        output = false;
    }
    for (int loop = 3;
    loop <= Math.sqrt(input);
    loop += 2
    ) {
        if (0 == input % loop) {
            output = false;
        }
    }
    return output;
}
/**
 * isEmirp() determines whether the reversal of an input number is prime.
 *
 * reference:
 * http://www.programmingsimplified.com/java/source-code/java-program-reverse-number
 */
public static double isEmirp(double input) {
    double value = 0;
    while (0 < input) {
        value  = value * 10;
        value += input % 10;
        input  = (int) input / 10;
    }
    if (false == exercise627.isPrime(value)) {
        return 0;
    }
    return value;
}
}
