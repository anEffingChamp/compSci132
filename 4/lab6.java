/**
 * package: computer science 132
 * lab:     6: MyInteger class
 * author:  Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class lab6
{
/**
 * Problem Description:
 * Design a class named MyInteger. The class contains: 
 * An int data field named value that stores the int value represented by this object.
 * A constructor that creates a MyInteger object for the specified int value.
 * A get method that returns the int value.
 * Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime, respectively.
 * Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
 * Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
 * Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
 * A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
 * A static method parseInt(String) that converts a string into an int value. 
 *
 * Draw the UML diagram for the class. Implement the class. Write a client program that tests all methods in the class.
 */
public static void main(String[] args)
{
    Scanner userInput = new Scanner(System.in);
    System.out.print("Please enter an integer to test the MyInteger object: ");
    int input         = userInput.nextInt();
    boolean inputEven = true;
    if (1 == input % 2) {
        inputEven = false;
    }
    MyInteger userObject = new MyInteger(input);
    if (inputEven               == MyInteger.isEven()
    &&  inputEven               == MyInteger.isEven(input)
    &&  inputEven               == MyInteger.isOdd()
    &&  inputEven               == MyInteger.isOdd(input)
    &&  isPrime((double) input) == MyInteger.isPrime(input)
    ) {
        System.out.println("There are no object errors.");
        return;
    }
    System.out.println("There are errors in the object.");
}
/**
 * isPrime() determines whether an input is a prime number. Its input must be a
 * double for accurate division.
 */
public static boolean isPrime(double input) {
    boolean output = true;
    if (0 == input % 2) {
        output = false;
    }
    for (int loop = 3;
    loop <= Math.sqrt(input);
    loop += 2
    ) {
        if (0 == input % loop) {
            output = false;
        }
    }
    return output;
}
}
class MyInteger
{
private static int _integer = 0;
/*
 * A constructor that creates a MyInteger object for the specified int value.
 */
public MyInteger(int integer)
{
    MyInteger._integer = integer;
}
/*
 * A get method that returns the int value.
 */
public static int getInteger()
{
    return MyInteger._integer;
}
/*
 * Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime, respectively.
 * Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
 * Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is even, odd, or prime, respectively.
 */
public static boolean isEven()
{
    boolean output = false;
    if (0 == MyInteger._integer % 2) {
        output = true;
    }
    return output;
}
public static boolean isEven(int input)
{
    boolean output = false;
    if (0 == input % 2) {
        output = true;
    }
    return output;
}
public boolean isEven(Object MyInteger)
{
    boolean output = false;
    if (0 == this._integer % 2) {
        output = true;
    }
    return output;
}
public static boolean isOdd()
{
    boolean output = false;
    if (1 == MyInteger._integer % 2) {
        output = true;
    }
    return output;
}
public static boolean isOdd(int input)
{
    boolean output = false;
    if (1 == input % 2) {
        output = true;
    }
    return output;
}
/**
 * isPrime() determines whether an input is a prime number. Its input must be a
 * double for accurate division.
 */
public static boolean isPrime() {
    double input   = (double) MyInteger._integer;
    boolean output = true;
    if (0 == input % 2) {
        output = false;
    }
    for (int loop = 3;
    loop <= Math.sqrt(input);
    loop += 2
    ) {
        if (0 == input % loop) {
            output = false;
        }
    }
    return output;
}
public static boolean isPrime(int inputInteger) {
    double input   = (double) inputInteger;
    boolean output = true;
    if (0 == input % 2) {
        output = false;
    }
    for (int loop = 3;
    loop <= Math.sqrt(input);
    loop += 2
    ) {
        if (0 == input % loop) {
            output = false;
        }
    }
    return output;
}
public boolean isPrime(Object MyInteger) {
    double input   = (double) this._integer;
    boolean output = true;
    if (0 == input % 2) {
        output = false;
    }
    for (int loop = 3;
    loop <= Math.sqrt(input);
    loop += 2
    ) {
        if (0 == input % loop) {
            output = false;
        }
    }
    return output;
}
/*
 * Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
 */
public static boolean equals(int input)
{
    boolean output = false;
    if (input == MyInteger._integer) {
        output = true;
    }
    return output;
}
public boolean equals(MyInteger input)
{
    boolean output = false;
    if (input == this) {
        output = true;
    }
    return output;
}
/*
 * A static method parseInt(char[]) that converts an array of numeric characters to an int value. 
 */
public static int parseInt(char[] input)
{
    int output = 0;
    for (int loop = 0;
    loop < input.length;
    loop++
    ) {
        output = output * 10;
        output += Character.getNumericValue(input[loop]);
    }
    return output;
}
/*
 * A static method parseInt(String) that converts a string into an int value. 
 */
public static int parseInt(String input)
{
    int output = 0;
    for (int loop = 0;
    loop < input.length();
    loop++
    ) {
        output = output * 10;
        output += Character.getNumericValue(input.charAt(loop));
    }
    return output;
}
}
