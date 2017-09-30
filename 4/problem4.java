/**
 * package:  computer science 132
 * problem: 4: print all perfect numbers <= 10000
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class problem4
{
public static void main(String[] args)
{
    int sum = 0;
    for (int loop  = 2;
    loop          <= 10000;
    loop++
    ) {
        sum = 0;
        for (int loopTwo = 1;
        loopTwo <= loop / 2;
        loopTwo++
        ) {
            if (0 == loop % loopTwo) {
                sum += loopTwo;
            }
        }
        if (sum == loop) {
            System.out.println(loop);
        }
    }
}
}
