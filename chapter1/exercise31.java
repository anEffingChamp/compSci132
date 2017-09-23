/**
 * package:  computer science 132
 * exercise: 3.1 solve quadratic equations
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise31
{
/**
 * This program finds the roots of a quadratic equation.
 */
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter space separated integers for a, b, and c. ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    /*
     * We can calculate the roots once we have the inputs.
     */
    double bSquared         = Math.pow(b, 2);
    double rootDiscriminant = Math.pow(bSquared - (4 * a * c), 0.5);
    if (0 == rootDiscriminant) {
        double root1 = ((-1 * b) + rootDiscriminant) / (2 * a);
        System.out.println("The equation has one real root: " + root1);
        return;
    } else if (0 < rootDiscriminant) {
        System.out.println(rootDiscriminant);
        System.out.println(bSquared);
        double root1 = ((-1 * b) + rootDiscriminant) / (2 * a);
        double root2 = ((-1 * b) - rootDiscriminant) / (2 * a);
        System.out.println(
            "The equation has two real roots: "
            + root1 + " "
            + root2
        );
        return;
    }
    System.out.println("The equation has no real roots.");
}
}
