/**
 * package:  computer science 132
 * exercise: 13.17 complex number
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise1317
{
public static void main(String[] args)
{
    Scanner userScanner = new Scanner(System.in);
    System.out.println("Please enter the first complex number: ");
    double firstA       = userScanner.nextDouble();
    double firstB       = userScanner.nextDouble();
    Complex userNumber  = new Complex(firstA, firstB);
    System.out.println("Please enter the second complex number: ");
    double secondA      = userScanner.nextDouble();
    double secondB      = userScanner.nextDouble();

    System.out.println(
        "(" + userNumber.a + " + " + userNumber.b + "i) + "
        + "(" + secondA + " + " + secondB + "i) = "
        + userNumber.add(secondA, secondB)
    );
    System.out.println(
        "(" + userNumber.a + " + " + userNumber.b + "i) - "
        + "(" + secondA + " + " + secondB + "i) = "
        + userNumber.subtract(secondA, secondB)
    );
    System.out.println(
        "(" + userNumber.a + " + " + userNumber.b + "i) * "
        + "(" + secondA + " + " + secondB + "i) = "
        + userNumber.multiply(secondA, secondB)
    );
    System.out.println(
        "(" + userNumber.a + " + " + userNumber.b + "i) / "
        + "(" + secondA + " + " + secondB + "i) = "
        + userNumber.divide(secondA, secondB)
    );
    System.out.println(
        "|" + userNumber.a + " + " + userNumber.b + "i| = "
        + userNumber.abs()
    );
}
}
class Complex implements Cloneable
{
/**
 * |-----------------------------------------------------|
 * | class Complex implements Cloneable
 * |-----------------------------------------------------|
 * | a = 0;
 * | b = 0;
 * | i
 * | value
 * |-----------------------------------------------------|
 * | Complex()
 * | Complex(double a)
 * | Complex(double a, double b)
 * | add(double a, double b)
 * | subtract(double a, double b)
 * | multiply(double a, double b)
 * | divide(double a, double b)
 * | abs()
 * | toString()
 * |-----------------------------------------------------|
 */
double a = 0;
double b = 0;
double i;
double value;
public Complex()
{
    this.i = Math.sqrt(-1);
}
public Complex(double a)
{
    this();
    this.a = a;
}
public Complex(double a, double b)
{
    this(a);
    this.b     = b;
    this.value = this.a + (this.b * this.i);
}
public String add(double a, double b)
{
    double outputA = this.a + a;
    double outputB = this.b + b;
    return outputA + " + " + outputB + "i";
}
public String subtract(double a, double b)
{
    double outputA = this.a - a;
    double outputB = this.b - b;
    return outputA + " + " + outputB + "i";
}
public String multiply(double a, double b)
{
    double outputA = (this.a * a) - (this.b - b);
    double outputB = (this.b * a) + (this.a * b);
    return outputA + " + " + outputB + "i";
}
public String divide(double a, double b)
{
    double divisor = Math.pow(a, 2) + Math.pow(b, 2);
    double outputA = (this.a * a) + (this.b - b) / divisor;
    double outputB = (this.b * a) - (this.a * b) / divisor;
    return outputA + " + " + outputB + "i";
}
public double abs()
{
    return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
}
public String toString()
{
    if (0 == this.b) {
        return "(" + this.a + ")";
    }
    return "(" + this.a + " + " + this.b + "i)";
}
public void getImaginaryPart()
{
    System.out.println("i = " + this.i);
}
public void getRealPart()
{
    System.out.println("a = " + this.a);
    System.out.println("b = " + this.b);
}
public boolean clone(Object input)
{
    Complex number = new Complex(this.a, this.b);
    return true;
}
}
interface Cloneable
{
public boolean clone(Object input);
}
