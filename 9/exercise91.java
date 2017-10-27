/**
 * package:  computer science 132
 * exercise: 9.1: Rectangle class
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
public class exercise91
{
/**
 * Design a class named Rectangle to represent a Rectangle.
 * Create two objects, one with height = 40, width = 4
 * -    one with height = 35.9, width = 3.5
 * Display the width, height, area, and perimeter of each Rectangle.
 */
public static void main(String[] args)
{
    Rectangle Rectangle1 = new Rectangle(40.0, 4.0);
    System.out.println("The height is " + Rectangle1.height);
    System.out.println("The width is " + Rectangle1.width);
    System.out.println("The area is " + Rectangle1.getArea());
    System.out.println("The perimeter is " + Rectangle1.getPerimeter());
    Rectangle Rectangle2 = new Rectangle(35.9, 3.5);
    System.out.println("The height is " + Rectangle2.height);
    System.out.println("The width is " + Rectangle2.width);
    System.out.println("The area is " + Rectangle2.getArea());
    System.out.println("The perimeter is " + Rectangle2.getPerimeter());
}
}
class Rectangle
{
/**
 * |---------------------------------------------|
 * | class Rectangle                             |
 * |---------------------------------------------|
 * | double height                               |
 * | double width                                |
 * |---------------------------------------------|
 * | +void Rectangle()                           |
 * | +void Rectangle(double height, double width)|
 * | +double getArea()                           |
 * | +double getPerimeter()                      |
 * |---------------------------------------------|
 */
static double height = 1.0;
static double width  = 1.0;
/**
 * The default constructor assigns 1.0 to the height, and width.
 */
public Rectangle()
{
    return;
}
/**
 * Users can also specify the height, and width of the Rectangle.
 */
public Rectangle(
    double height,
    double width
) {
    Rectangle.height = height;
    Rectangle.width  = width;
    return;
}
/**
 * getArea() returns the area of the Rectangle.
 */
public static double getArea()
{
    return Rectangle.height * Rectangle.width;
}
/**
 * getPerimeter() returns the perimeter of the Rectangle.
 */
public static double getPerimeter()
{
    return (2 * Rectangle.height) + (2 * Rectangle.width);
}
}
