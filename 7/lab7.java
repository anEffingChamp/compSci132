/**
 * package:  computer science 132
 * exercise: lab 7: locker puzzle
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
public class lab7
{
/**
 * Locker Puzzle
 *
 * Problem Description:
 * - A school has 100 lockers and 100 students. All lockers are closed on the 
 * first day of school.
 * - As the students enter, the first student, denoted S1, 
 * opens every locker.
 * - Then the second student, S2, begins with the second locker, denoted L2, 
 *   and closes every other locker.
 * - Student S3 begins with the third locker and changes every third locker 
 *   (closes it if it was open, and opens it if it was closed).
 * - Student S4 begins with locker L4 and changes every fourth locker.
 * - Student S5 starts with L5 and changes every fifth locker, and so on, 
 *   until student S100 changes L100.
 *
 * After all the students have passed through the building and changed the 
 * lockers, which lockers are open? Write a program to find your answer. The 
 * program should display the answer like this: 
 *
 * Locker x is open
 * Locker y is open
 * Locker z is open
 *
 * (Hint: Use an array of 100 boolean elements, each of which indicates 
 * whether a locker is open (true) or closed (false). Initially, all lockers 
 * are closed.)
 */
/*
 * lab7._lockers[0] = true means that a locker is open.
 * lab7._lockers[0] = false means that the locker is closed.
 */
private static boolean[] _lockers = new boolean[100];
public static void main(String[] args)
{
    System.out.println(
        "All lockers start closed. When all students have entered:"
    );
    /*
     * The outer loop simulates the actions of the students. The inner loop
     * assigns the state to the given lockers.
     */
    for (int studentID = 0;
    studentID < 100;
    studentID++
    ) {
        for (int lockerID = studentID;
        lockerID < 100;
        lockerID += studentID
        ) {
            /*
             * We guarantee that the first student opens all lockers with this
             * condition.
             */
            if (0 == studentID) {
                lab7._lockers[lockerID] = true;
                lockerID++;
                continue;
            }
            if (true == lab7._lockers[lockerID]) {
                lab7._lockers[lockerID] = false;
            } else {
                lab7._lockers[lockerID] = true;
            }
        }
    }
    /*
     * Once we have determines the state of each locker, we loop through the
     * lockers array again to print the result.
     */
    for (int lockerID = 0;
    lockerID < 100;
    lockerID++
    ) {
        String output = " open.";
        if (false == lab7._lockers[lockerID]) {
            output = " closed.";
        }
        System.out.println("Locker " + lockerID + " is " + output);
    }
}
}
