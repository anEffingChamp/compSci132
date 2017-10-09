/**
 * package:  computer science 132
 * exercise: 7.27: identical arrays
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
import java.util.Arrays;
public class exercise727
{
public static int[][] list = new int[2][1];
/**
 * The arrays list1 and list2 are identical if they have the same contents.
 * Write a method that returns true if list1 and list2 are identical.
 */
public static void main(String[] args)
{
    Scanner userInput = new Scanner(System.in);
    for (int loop = 0;
    loop <= 1;
    loop++
    ) {
        System.out.print(
            "Please enter a list of space separated integers for list"
            + (loop + 1) + ". "
            + "The first integer should be the length of the remaining list items. "
        );
        int listLength         = userInput.nextInt();
        exercise727.list[loop] = new int[listLength];
        for (int innerLoop = 0;
        innerLoop < listLength;
        innerLoop++
        ) {
            exercise727.list[loop][innerLoop] = userInput.nextInt();
        }
        System.out.println();
    }
    String output = "The two lists are not identical.";
    if (true == exercise727.equals(exercise727.list[0], exercise727.list[1])) {
        output = "The two lists are identical.";
    }
    System.out.println(output);
}
/**
 * This function already exists in
 * https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
 */
public static boolean equals(int[] list1, int[] list2)
{

    boolean output = false;
    if (list1.length == list2.length) {
        Arrays.sort(list1);
        Arrays.sort(list2);
        for (int loop = 0;
        loop < list1.length;
        loop++
        ) {
            if (list1[loop] != list2[loop]) {
                break;
            }
            if (loop        == list1.length - 1
            &&  list1[loop] == list2[loop]
            ) {
                output = true;
            }
        }
    }
    return output;
}
}
