/**
 * package:  computer science 132
 * exercise: 8.11: nine heads and tails
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;
public class exercise811
{
private static String _input;
/**
 * This function accepts an integer input from 0 through 511, and outputs a
 * binary representational matrix of nine coin flips where 0 is heads, and 1 is
 * tails.
 */
public static void main(String[] args)
{
    Scanner userInput  = new Scanner(System.in);
    System.out.print("Please input an integer between 0 and 511: ");
    exercise811._input = Integer.toBinaryString(userInput.nextInt());
    String stringStart = "";
    for (int loop = 0;
    9 > loop + exercise811._input.length();
    loop++
    ) {
        stringStart += "0";
    }
    exercise811._input = stringStart + exercise811._input;
    System.out.println(exercise811._input);
    for (int loop = 0;
    loop < 9;
    loop++
    ) {
        if (0 == loop % 3) {
            System.out.println();
        }
        String output = "H ";
        if ('1' == exercise811._input.charAt(loop)) {
            output = "T ";
        }
        System.out.print(output);
    }
}
}
