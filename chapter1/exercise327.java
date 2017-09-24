/**
 * package:  computer science 132
 * exercise: 3.27 points on a triangle
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise327
{
private static double _triangleY     = 100;
private static double _triangleX     = 200;
private static double _triangleSlope =
    -1 * exercise327._triangleY / exercise327._triangleX;
/**
 * This program calculates whether a given X,Y coordinate is within a right
 * triangle with vertices at 0, 100 and 200, 0.
 */
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print(
        "Please enter space separated decimal values for the X and Y "
        + "coordinates: "
    );
    double inputX             = input.nextDouble();
    double inputY             = input.nextDouble();
    double triangleHypotenuse =
        exercise327._triangleY
        + (exercise327._triangleSlope * inputX);
    /*
     * We can end execution early if either value is negative, or greater
     * than its vertices because those criteria put the point outside of the
     * vertical, and horizontal legs of the triangle.
     */
    if (inputX < 0
    ||  inputY < 0
    ||  inputX > exercise327._triangleX
    ||  inputY > exercise327._triangleY
    ||  inputY > triangleHypotenuse
    ) {
        System.out.println("The point is not within the triangle.");
        return;
    }
    System.out.println("The point is within the triangle.");
}
}
