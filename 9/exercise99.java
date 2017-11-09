/**
 * package:  computer science 132
 * exercise: 9.9: n sided regular polygon
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
public class exercise99
{
public static void main(String[] args)
{
    String areaString = "The area is ";
    String perimeterString = "The perimeter is ";
    Polygon number1 = new Polygon();
    System.out.println(areaString + number1.getArea());
    System.out.println(perimeterString + number1.getPerimeter());
    Polygon number2 = new Polygon(6, 4.0);
    System.out.println(areaString + number2.getArea());
    System.out.println(perimeterString + number2.getPerimeter());
    Polygon number3 = new Polygon(10, 4.0, 5.6, 7.8);
    System.out.println(areaString + number3.getArea());
    System.out.println(perimeterString + number3.getPerimeter());
}
}
class Polygon
{
/**
 * |---------------------------------------------|
 * | class Polygon                               |
 * |---------------------------------------------|
 * |-int n = 3                                   |
 * |-double side = 1                             |
 * |-double x = 0                                |
 * |-double y = 0                                |
 * |---------------------------------------------|
 * | +void Polygon()                             |
 * | +void Polygon(int sides, double sideLength) |
 * | +void Polygon(int sides, double sideLength, |
 * |    double x, double y)                      |
 * |
 * | +getLength()                                |
 * | +setLength(double sideLength)               |
 * | +getSides()                                 |
 * | +setSides(int sides)                        |
 * | +getCoordinateX()                           |
 * | +setCoordinateX(double x)                   |
 * | +getCoordinateY()                           |
 * | +setCoordinateY(double y)                   |
 * |
 * | +double getArea()                           |
 * | +double getPerimeter()                      |
 * |---------------------------------------------|
 */
static int n       = 3;
static double side = 1;
static double x    = 0;
static double y    = 0;
/**
 * The default constructor assigns 1.0 to the height, and width.
 */
public Polygon()
{
    return;
}
/**
 * Users can also specify the height, and width of the Polygon.
 */
public Polygon(
    int sides,
    double sideLength
) {
    Polygon.n    = sides;
    Polygon.side = sideLength;
}
public Polygon(
    int sides,
    double sideLength,
    double x,
    double y
) {
    Polygon.n    = sides;
    Polygon.side = sideLength;
    Polygon.x    = x;
    Polygon.y    = y;
}
public void setSides(int sides)
{
    Polygon.n = sides;
}
public int getSides()
{
    return Polygon.n;
}
public double getLength()
{
    return Polygon.side;
}
public void setLength(double sideLength)
{
    Polygon.side = sideLength;
}
public double getCoordinateX()
{
    return Polygon.x;
}
public void setCoordinateX(double x)
{
    Polygon.x = x;
}
public double getCoordinateY()
{
    return Polygon.y;
}
public void setCoordinateY(double y)
{
    Polygon.y = y;
}
/**
 * getArea() returns the area of the Polygon.
 */
public static double getArea()
{
    return (Polygon.n * Math.pow(Polygon.side, 2))
        / (4 * Math.tan(Math.PI / Polygon.n));
}
/**
 * getPerimeter() returns the perimeter of the Polygon.
 */
public static double getPerimeter()
{
    return Polygon.side * Polygon.n;
}
}
