/**
 * package:  computer science 132
 * exercise: 5.14: occurence of max numbers
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise514
{
/**
 * This program finds the largest in a group of integers, and counts its
 * occurences within the group.
 */
public static int value      = 0;
public static int valueCount = 0;
public static void main(String[] args)
{
    Scanner userInput   = new Scanner(System.in);
    System.out.print("Please enter a space separated series of integers: ");
    /*
     * This loop will run until we have checked all input integers.
     */
    int value = 0;
    while (userInput.hasNextInt()) {
        value = userInput.nextInt();
        if (value == 0) {
            break;
        }
        if (value > exercise514.value) {
            exercise514.value      = value;
            exercise514.valueCount = 1;
            continue;
        }
        if (value == exercise514.value) {
            exercise514.valueCount++;
        }
    }
    System.out.println("The maximum value is " + exercise514.value);
    System.out.println("This value occurred " + exercise514.valueCount + " times");
}
}
