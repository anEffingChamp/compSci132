/**
 * package:  computer science 132
 * exercise: 11.9 largest rows and columns
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
import java.util.ArrayList;
public class exercise119
{
public static void main(String[] args)
{
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the array size n: ");
    int count         = userInput.nextInt();
    if (0 >= count) {
        System.out.print("Please enter a positive integer greater than 0.");
        return;
    }
    int[][] matrix = new int[count][count];
    ArrayList<Integer> indices = new ArrayList();
    indices.add(0);
    indices.add(0);
    for (int row = 0;
    row < count;
    row++
    ) {
        int rowSum = 0;
        for (int column = 0;
        column < count;
        column++
        ) {
            int columnSum = 0;
            int value     = 0;
            if (Math.random() >= 0.5) {
                value = 1;
            }
            matrix[row][column]  = value;
            rowSum              += value;
            if (row == count - 1) {
                for (int loop = 0;
                loop < count;
                loop++
                ) {
                    columnSum += matrix[loop][column];
                }
                if (indices.get(1) < columnSum) {
                    indices.set(1, column);
                }
            }

            System.out.print(value);
        }
        if (indices.get(0) < rowSum) {
            indices.set(0, row);
        }
        System.out.println();
    }
    System.out.println("The largest row index is: " + indices.get(0));
    System.out.println("The largest column index is: " + indices.get(1));
}
}
