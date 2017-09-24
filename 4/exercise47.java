/**
 * package:  computer science 132
 * exercise: 4.7: corner point coordinates
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise47
{
private static int _angleInteror = 360 / 5;
/**
 * This program calculates the coordinates of the four remaining points of a
 * pentagon, assuming that:
 * -    the pentagon is centered at 0, 0
 * -    one point lies along the Y axis
 * -    the bounding circle of the pentagon has the user input radius
 */
public static void main(String[] args)
{
    Scanner userInput   = new Scanner(System.in);
    System.out.print("Please enter the radius of the bounding circle: ");
    double circleRadius = userInput.nextDouble();
    double pointX       = 0;
    double pointY       = circleRadius;
    System.out.println(
        "The coordinates of the five points of the pentagon are:"
    );
    System.out.println(pointX + ", " + pointY);
    /*
     * We can now calculate the remaining four points by breaking the pentagon
     * down into a series of right triangles. We have the length of the
     * hypotenuse, and its corresponding angle. We just need to find the length
     * of the other two legs to get the pentagon vertex coordinates.
     *
     * reference:
     * http://mathforum.org/sarah/hamilton/ham.1side.1angle.html
     */
    for (int loop = 1;
    loop < 5;
    loop++
    ) {
        double triangleInterior = loop * exercise47._angleInteror;
        /*
         * We determine which quadrant we are in to decide how to manage the
         * positive, and negative signs for our coordinates.
         */
        int pointXSign = 1;
        int pointYSign = 1;
        switch ((int) triangleInterior / 90) {
        case 3:
            pointXSign = -1;
            pointYSign = 1;
            break;
        case 2:
            pointXSign = -1;
            pointYSign = -1;
            break;
        case 1:
            pointXSign = 1;
            pointYSign = -1;
        }
        /*
         * Then we calculate the angle within our right triangle. It can not be
         * greater than 45.
         */
        if (45 <= triangleInterior) {
            triangleInterior = triangleInterior % 90;

            pointX = pointXSign * (circleRadius * Math.sin(triangleInterior));
            pointY = pointYSign * (circleRadius * Math.cos(triangleInterior));
        } else {
            triangleInterior = triangleInterior % 45;

            pointX = pointXSign * (circleRadius * Math.cos(triangleInterior));
            pointY = pointYSign * (circleRadius * Math.sin(triangleInterior));
        }
        System.out.println(pointX + ", " + pointY);
    }
}
}
