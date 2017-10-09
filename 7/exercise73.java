/**
 * package:  computer science 132
 * exercise: 7.3: count occurence of numbers
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise73
{
/*
 * There can only be 100 numbers when x = [1, 100], so this array can store the
 * frequency of each digit in its corresponding array index. For a given value X
 * remember that frequency[X - 1] is its mode.
 */
public static int[] frequency = new int[100];
/**
 * This program reads a series of integers, and counts the occurences of each. We
 * assume that the input list ends with the first zero.
 */
public static void main(String[] args)
{
    Scanner userInput = new Scanner(System.in);
    System.out.print(
        "Please enter a list of space separated integers between 1 and 100. "
        + "The list must end with 0."
    );
    while (true == userInput.hasNextInt()) {
        int userInteger = userInput.nextInt();
        if (0 == userInteger) {
            break;
        }
        exercise73.frequency[userInteger - 1]++;
    }
    for (int loop = 0;
    loop < exercise73.frequency.length;
    loop++
    ) {
        String outputSuffix = " times.";
        switch (exercise73.frequency[loop]) {
        case 1:
            outputSuffix = " time.";
            break;
        case 0:
            continue;
        }
        int userInteger = loop + 1;
        System.out.println(
            userInteger
            + " occurs "
            + exercise73.frequency[loop]
            + outputSuffix
        );
    }
}
}
