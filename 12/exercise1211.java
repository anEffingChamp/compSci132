/**
 * package:  computer science 132
 * exercise: 12.11 remove text
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
import java.util.Scanner;
import java.io.File;
public class exercise1211
{
private String _needle;
private String _fileName;
public void main(String[] args)
{
    Scanner userScanner = new Scanner(System.in);
    System.out.println("Please enter a search string, and file name to edit: ");
    this._needle        = userScanner.next();
    this._fileName      = userScanner.next();
    try {
        Scanner fileScanner = new Scanner(new File(this._fileName));
        while (true == fileScanner.hasNextLine()) {
            String fileLine = fileScanner.nextLine();
            System.out.println(fileLine.replace(this._needle, ""));
        }
    } catch (Throwable error) {
        System.out.println("Please enter a valid file name.");
    }
}
}
