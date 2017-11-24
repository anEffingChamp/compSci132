/**
 * package:  computer science 132
 * exercise: 11.17 algebra, perfect square
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise1117
{
public static void main(String[] args)
{
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter an integer m: ");
    int input         = userInput.nextInt();
    double square     = 0;
    double squareRoot = 0;
    int loop          = 1;
    while (0 == square) {
        squareRoot = Math.sqrt(input * loop);
        if (Math.floor(squareRoot) == squareRoot) {
            square = Math.pow(squareRoot, 2);
            break;
        }
        loop++;
    }
    System.out.println(
        "The smallest number n for m * n to be a perfect square is: "
        + loop
    );
    System.out.println("m * n is " + (int) square);
}
}
