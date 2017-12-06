/**
 * package:  computer science 132
 * exercise: 12.1 NumberFormatException
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
import java.util.ArrayList;
public class exercise121 extends Calculator
{
public static void main(String[] args)
{
    Scanner userScanner       = new Scanner(System.in);
    System.out.println("Please enter a simple arithmetic equation: ");
    Calculator calculator     = new Calculator();
    boolean userInputAddition = true;
    ArrayList<Double> equation = new ArrayList<Double>();
    while (true == userScanner.hasNext()) {
        String userInput = userScanner.next();
        if ('-' == userInput.charAt(0)
        ||  '+' == userInput.charAt(0)
        ) {
            if ('-' == userInput.charAt(0)) {
                userInputAddition = false;
            }
            continue;
        }
        if (true != Calculator.isNumeric(userInput)) {
            return;
        }
        equation.add(Double.parseDouble(userInput));
    }
    double output = equation.get(0) + equation.get(1);
    char equationSign = '+';
    if (false == userInputAddition) {
        equationSign = '-';
        output = equation.get(0) - equation.get(1);
    }
    System.out.println(
        equation.get(0) + " " + equationSign + " " + equation.get(1)
        + "= " + String.valueOf(output)
    );
}
}
class Calculator
{
public Calculator()
{
}
public static boolean isNumeric(String input)
{
    try {
        double inputDouble = Double.parseDouble(input);
    } catch(NumberFormatException error) {
        System.out.println("Wrong Input: " + input);
        return false;
    }
    return true;
}
}
