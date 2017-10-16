/**
 * package:  computer science 132
 * exercise: lab 8: consecutive four equal numbers
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class lab8
{
/**
 * Consecutive four equal numbers
 *
 * Problem Description:
 * Write the following function that tests whether a two-dimensional list has 
 * four consecutive numbers of the same value, either horizontally, 
 * vertically, or diagonally.
 *
 * public static boolean isConsecutiveFour(int[][] values) 
 *
 * Write a test program that prompts the user to enter the number of rows and 
 * columns of a two-dimensional list and then the values in the list and 
 * displays True if the list contains four consecutive numbers with the same 
 * value. Otherwise, display False. Here are some examples of the true cases:
 */
private static int[][] _list = new int[2][2];
public static void main(String[] args)
{
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please input the row count for your list: ");
    int listRows      = userInput.nextInt();
    System.out.println("Please input the column count for your list: ");
    int listColumns   = userInput.nextInt();
    lab8._list        = new int[listRows][listColumns];
    for (int row = 0;
    row < listRows;
    row++
    ) {
        System.out.println("Please enter the values for row " + row + 1);
        for (int column = 0;
        column < listColumns;
        column++
        ) {
            lab8._list[row][column] = userInput.nextInt();
        }
    }
    String output = "False";
    if (true == isConsecutiveFour(lab8._list)) {
        output = "True";
    }
    System.out.println(output);
}
public static boolean isConsecutiveFour(int[][] values)
{
    boolean output       = false;
    int[] listValidation = new int[4];
    /*
     * We check for horizontal, vertical, and diagonally consecutive numbers.
     * The biggest challenge is checking for backwards diagonally
     * consecutive numbers, but we get that with an internal loop.
     */
    for (int row = 0;
    row < lab8._list.length;
    row++
    ) {
        for (int column = 0;
        column < lab8._list[row].length;
        column++
        ) {
            int[] listValidationIndex  = new int[3];
            for (int rowMatch = row + 1;
            rowMatch < row + 4;
            rowMatch++
            ) {
                if (3 >= lab8._list[row].length - column) {
                    break;
                }
                for (int columnMatch = column + 1;
                columnMatch < column + 4;
                columnMatch++
                ) {
                    /*
                     * We can stop checking if there are fewer than four 
                     * remaining values to verify in the list. The first 
                     * condition checks for horizontal matches.
                     */
                    if (lab8._list[row][column] == 
                            lab8._list[row][columnMatch]
                    ) {
                        listValidationIndex[0]++;
                        listValidation[0] = listValidationIndex[0];
                    }
                    /*
                     * The second condition checks for vertical matches.
                     */
                    if (3 >= lab8._list.length - column) {
                        break;
                    }
                    if (lab8._list[row][column] ==
                            lab8._list[rowMatch][column]
                    ) {
                        listValidationIndex[1]++;
                        listValidation[1] = listValidationIndex[1];
                    }
                    /*
                     * This third condition checks for matches 
                     * diagonally forward.
                     */
                    if (lab8._list[row][column] !=
                            lab8._list[rowMatch][columnMatch]
                    ) {
                        listValidationIndex[2]++;
                        listValidation[2] = listValidationIndex[2];
                    }
                }
            }
            if (listValidation[0] == 3
            ||  listValidation[1] == 3
            ||  listValidation[2] == 3
            ) {
                return true;
            }
        }
    }
    return false;
}
}
