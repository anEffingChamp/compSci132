/**
 * package:  computer science 132
 * exercise: 11.1 Triangle class
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise111
{
public static void main(String[] args)
{
    Scanner userInput = new Scanner(System.in);
    System.out.println(
        "Please enter the three sides of a triangle, a color, and whether the"
        + " triangle is filled."
    );
    Triangle userTriangle = new Triangle(
        userInput.nextDouble(), userInput.nextDouble(), userInput.nextDouble()
    );
    userTriangle.setColor(userInput.next());
    userTriangle.setFill(userInput.nextBoolean());
    System.out.println("area: " + userTriangle.getArea());
    System.out.println("perimeter: " + userTriangle.getPerimeter());
    System.out.println("color: " + userTriangle.getColor());
    System.out.println("filled: " + userTriangle.getFill());
}
}
class GeometricObject
{
/**
 * |-----------------------------------------------------|
 * | class GeometricObject
 * |-----------------------------------------------------|
 * | filled = false;
 * | color;
 * |-----------------------------------------------------|
 * | + setFill()
 * | + setColor()
 * |-----------------------------------------------------|
 */
boolean filled = false;
String color;
public boolean setFill(boolean input)
{
    this.filled = input;
    return true;
}
public boolean getFill()
{
    return this.filled;
}
public String getColor()
{
    return this.color;
}
public boolean setColor(String input)
{
    this.color = input;
    return true;
}
}
class Triangle extends GeometricObject
{
/**
 * |-----------------------------------------------------|
 * | class Triangle
 * |-----------------------------------------------------|
 * | double side1 = 1.0
 * | double side2 = 1.0
 * | double side3 = 1.0
 * |-----------------------------------------------------|
 * | + Triangle()
 * | + Triangle(double side1, double side2, double side3)
 * | + getSide(int side)
 * | + getArea()
 * | + getPerimeter()
 * | + toString()
 * |-----------------------------------------------------|
 */
double side1 = 1.0;
double side2 = 1.0;
double side3 = 1.0;
public Triangle()
{
}
public Triangle(double side1, double side2, double side3)
{
    if (side1 <= 0
    ||  side2 <= 0
    ||  side3 <= 0
    ||  side1 >= side2 + side3
    ||  side2 >= side1 + side3
    ||  side3 >= side1 + side2
    ) {
        System.out.println("These sides are not compatible to form a triangle.");
        return;
    }
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
}
public double getSide(int side)
{
    switch (side) {
    case 3:
        return this.side3;
    case 2:
        return this.side2;
    default:
        return this.side1;
    }
}
/**
 * reference: https://en.wikipedia.org/wiki/Triangle
 *
 * We calculate the triangle area with Heron's formula.
 */
public double getArea()
{
    double semiPerimeter = (this.side1 + this.side2 + this.side3) / 2;
    return Math.sqrt(
        semiPerimeter * (semiPerimeter - this.side1)
        * (semiPerimeter - this.side2) * (semiPerimeter - this.side3)
    );
}
public double getPerimeter()
{
    return this.side1 + this.side2 + this.side3;
}
public String toString()
{
    return "Triangle: side1 = " + this.side1
        + " side2 = " + this.side2
        + " side3 = " + this.side3;
}
}
