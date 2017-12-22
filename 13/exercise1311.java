/**
 * package:  computer science 132
 * exercise: 13.11 octagon
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
public class exercise1311
{
public void main(String[] args)
{
}
}
class Octagon extends GeometricObject
    implements Comparable, Cloneable
{
/**
 * |-----------------------------------------------------|
 * | class Octagon extends GeometricObject
 * |    implements Comparable, Cloneable
 * |-----------------------------------------------------|
 * | int side = 1;
 * |-----------------------------------------------------|
 * | +getArea()
 * | +compareTo(Object input)
 * | +clone(Object input)
 * |-----------------------------------------------------|
 */
double side = 1;
public void Octagon()
{
}
public void Octagon(double side)
{
    this.side = side;
}
public double getArea()
{
    return (2 + (4 * Math.sqrt(2)) * Math.pow(side, 2));
}
public boolean compareTo(Object input)
{
    return true;
}
public boolean clone(Object input)
{
    return true;
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
interface Comparable
{
public boolean compareTo(Object input);
}
interface Cloneable
{
public boolean clone(Object input);
}
