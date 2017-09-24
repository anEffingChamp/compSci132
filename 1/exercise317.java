/**
 * package:  computer science 132
 * exercise: 3.17 rock paper scissors
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
import java.util.Random;
public class exercise317
{
/**
 * This program plays rock paper scissor with a user based on integer input.
 */
public static void main(String[] args)
{
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    System.out.print(
        "Please choose an integer between scissor (0), rock (1), or paper (2): "
    );
    int[] argumentArray  = new int[2];
    String[] stringArray = new String[2];
    argumentArray[0]     = input.nextInt();
    argumentArray[1]     = random.nextInt(2);
    /*
     * We match the input integer with its corresponding string to for the
     * upcoming user output.
     */
    for (int loop = 0;
    loop <= 1;
    loop++
    ) {
        switch (argumentArray[loop]) {
        case 2:
            stringArray[loop] = "paper";
            continue;
        case 1:
            stringArray[loop] = "rock";
            continue;
        default:
            stringArray[loop] = "scissor";
        }
    }
    System.out.println(
        "The computer is "
        + stringArray[1] + " and you are "
        + stringArray[0] + "."
    );
    switch (argumentArray[0] - argumentArray[1]) {
    case -1:
    case 2:
        System.out.println("You lose.");
        return;
    case 1:
    case -2:
        System.out.println("You win.");
        return;
    }
    System.out.println("You tie.");
}
}
