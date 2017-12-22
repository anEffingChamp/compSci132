/**
 * package:  computer science 132
 * exercise: 18.13 find the largest number in an array
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise1813
{
static int[] userArray;
public static void main(String[] args)
{
    exercise1813.userArray = new int[8];
    Scanner userScanner = new Scanner(System.in);
    System.out.println("Please enter eight integers: ");
    for (int loop = 0;
    loop < 8;
    loop++
    ) {
        exercise1813.userArray[loop] = userScanner.nextInt();
    }
    System.out.println(
        "The highest value is "
        + exercise1813.findLargestNumber(
            exercise1813.userArray,
            exercise1813.userArray[0]
        )
    );
}
public static int findLargestNumber(int[] input, int highValue)
{
    switch (input.length) {
    case 1:
        if (highValue > input[0]) {
            return highValue;
        }
        return input[0];
    default:
        if (highValue < input[0]) {
            highValue = input[0];
        }
        int[] output = new int[input.length - 1];
        for (int loop = 1;
        loop < input.length;
        loop++
        ) {
            output[loop - 1] = input[loop];
        }
        return exercise1813.findLargestNumber(output, highValue);
    }
}
}
