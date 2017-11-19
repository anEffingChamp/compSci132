/**
 * package:  computer science 132
 * exercise: 10.3 MyInteger class
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
public class exercise103
{
/**
 * This class tests the values of the MyInteger class.
 */
public static void main(String[] args)
{
    Scanner userInput      = new Scanner(System.in);
    System.out.println("Please enter an integer: ");
    int input              = userInput.nextInt();
    MyInteger inputInteger = new MyInteger(input);

    boolean inputEven = false;
    if (0 == input % 2) {
        inputEven = true;
    }
    String output = "The class has errors.";
    if (input     == inputInteger.getValue()
    &&  inputEven == inputInteger.isEven()
    &&  inputEven == inputInteger.isEven(input)
    &&  inputEven == inputInteger.isEven(inputInteger)
    &&  inputEven != inputInteger.isOdd()
    &&  inputEven != inputInteger.isOdd(input)
    &&  inputEven != inputInteger.isOdd(inputInteger)
    &&  true      == inputInteger.equals(input)
    &&  true      == inputInteger.equals(inputInteger)
    ) {
        output = "MyInteger runs as expected.";
    }
    System.out.println(output);
}
}
class MyInteger
{
/**
 * |---------------------------------------------|
 * | class MyInteger
 * |---------------------------------------------|
 * | int value
 * |---------------------------------------------|
 * | + MyInteger(int input)
 * | + getValue()
 * | + isEven()
 * | + isEven(int input)
 * | + isEven(MyInteger input)
 * | + isOdd()
 * | + isOdd(int input)
 * | + isOdd(MyInteger input)
 * | + isPrime()
 * | + isPrime(int input)
 * | + isPrime(MyInteger input)
 * | + equals(int input)
 * | + equals(MyInteger input)
 * | + parseInt(char[] input)
 * | + parseInt(String)
 * |---------------------------------------------|
 */
int value = 0;
public MyInteger(int input)
{
    this.value = input;
}
public int getValue()
{
    return this.value;
}
public boolean isEven()
{
    return this.isEven(this.getValue());
}
public boolean isEven(int input)
{
    boolean output = false;
    if (0 == input % 2) {
        output = true;
    }
    return output;
}
public boolean isEven(MyInteger input)
{
    return this.isEven(input.getValue());
}
public boolean isOdd()
{
    return this.isOdd(this.getValue());
}
public boolean isOdd(int input)
{
    boolean output = false;
    if (1 == input % 2) {
        output = true;
    }
    return output;
}
public boolean isOdd(MyInteger input)
{
    return this.isOdd(input.getValue());
}
/**
 * isPrime() determines whether an input is a prime number. Its input must be a
 * double for accurate division.
 */
public boolean isPrime()
{
    double input = (double) this.getValue();
    return this.isPrime(input);
}
public boolean isPrime(double input)
{
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
public boolean isPrime(MyInteger input)
{
    double inputValue = (double) input.getValue();
    return this.isPrime(inputValue);
}
public boolean equals(int input)
{
    boolean output = false;
    if (this.value == input) {
        output = true;
    }
    return output;
}
public boolean equals(MyInteger input)
{
    int inputValue = input.getValue();
    return this.equals(inputValue);
}
public int parseInt(char[] input)
{
    String output = new String(input);
    return this.parseInt(output);
}
public int parseInt(String input)
{
    return Integer.parseInt(input);
}
}
