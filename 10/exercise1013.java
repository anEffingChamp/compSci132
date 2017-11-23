/**
 * package:  computer science 132
 * exercise: 10.13 MyRectangle2D class
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise1013
{
/**
 * This function tests the MyRectangle2D class, and its methods.
 */
public static void main(String[] args)
{
    MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
    System.out.println("The area is " + r1.getArea());
    System.out.println("The perimeter is " + r1.getPerimeter());
    System.out.println("contains (3,3)? " + r1.contains(3, 3));
    System.out.println(
        "contains another rectangle? "
        + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2))
    );
    System.out.println(
        "overlaps another rectangle? "
        + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))
    );
}
}
class MyRectangle2D
{
/**
 * |---------------------------------------------|
 * | class MyRectangle2D
 * |---------------------------------------------|
 * | double x = 0;
 * | double y = 0;
 * | double width = 1;
 * | double height = 1;
 * |---------------------------------------------|
 * | + MyRectangle2D(int input)
 * | + getHeight()
 * | + setHeight(double input)
 * | + getWidth()
 * | + setWidth(double input)
 * | + getArea()
 * | + getPerimeter()
 * | + contains(double x, double y)
 * | + contains(MyRectangle2D input)
 * | + overlaps(MyRectangle2D input)
 * |---------------------------------------------|
 */
double x      = 0;
double y      = 0;
double width  = 1;
double height = 1;
public MyRectangle2D()
{
}
public MyRectangle2D(double x, double y, double width, double height)
{
    if (0 >= width
    ||  0 >= height
    ) {
        System.out.println(
            "MyRectangle2D can not have zero length width or height."
        );
    }
    this.x      = x;
    this.y      = y;
    this.width  = width;
    this.height = height;
}
public double getHeight()
{
    return this.height;
}
public boolean setHeight(double input)
{
    this.height = input;
    return true;
}
public double getWidth()
{
    return this.width;
}
public boolean setWidth(double input)
{
    this.width = input;
    return true;
}
public double getArea()
{
    return this.width * this.height;
}
public double getPerimeter()
{
    return 2 * (this.width + this.height);
}
public boolean contains(double x, double y)
{
    boolean output    = false;
    double widthHalf  = this.width / 2;
    double heightHalf = this.height / 2;
    if (x >= this.x - widthHalf
    ||  x <= this.x + widthHalf
    ) {
        if (y >= this.y - heightHalf
        &&  y <= this.y + heightHalf
        ) {
            output = true;
        }
    }
    return output;
}
public boolean contains(MyRectangle2D input)
{
    boolean output         = false;
    double widthHalf       = this.width / 2;
    double heightHalf      = this.height / 2;
    double inputWidthHalf  = input.width / 2;
    double inputHeightHalf = input.height / 2;
    if (this.x - widthHalf  <= input.x - inputWidthHalf
    &&  this.x + widthHalf  >= input.x + inputWidthHalf
    &&  this.y - heightHalf <= input.y - inputHeightHalf
    &&  this.y + heightHalf >= input.y + inputHeightHalf
    ) {
        output = true;
    }
    return output;
}
public boolean overlaps(MyRectangle2D input)
{
    boolean output         = false;
    double widthHalf       = this.width / 2;
    double heightHalf      = this.height / 2;
    double inputWidthHalf  = input.width / 2;
    double inputHeightHalf = input.height / 2;
    if (false == this.contains(input)) {
        if (this.x - widthHalf - inputWidthHalf <= input.x
        ||  this.x + widthHalf + inputWidthHalf >= input.x
        ) {
            if (this.y - heightHalf - inputHeightHalf <= input.y
            ||  this.y + heightHalf + inputHeightHalf >= input.y
            ) {
                output = true;
            }
        }
    }
    return output;
}
}
