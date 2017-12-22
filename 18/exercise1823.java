/**
 * package:  computer science 132
 * exercise: 18.23 binary to decimal
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
import java.lang.Character;
public class exercise1823
{
public static void main(String[] args)
{
    exercise1813.userArray = new int[8];
    Scanner userScanner    = new Scanner(System.in);
    System.out.println("Please enter a string of characters: ");
    String userInput       = userScanner.next();
    System.out.println(
        "The binary value of the string is " + exercise1823.bin2Dec(userInput)
    );
}
public static int bin2Dec(String binaryString)
{
    Character character = binaryString.charAt(0);
    int value           = character.charValue();
    if (1 == binaryString.length()) {
        return value;
    }
    return (10 * value) + exercise1823.bin2Dec(binaryString.substring(1));
}
}
