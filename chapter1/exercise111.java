/**
 * package:  computer science 132
 * exercise: 1.11: population projection
 * author:   Jonathan Smalls <jon@smalls.rocks>
 */
public class exercise111
{
    private static int _populationInitial  = 312032486;
    private static int _daySeconds         = (60 * 60 * 24);
    /**
     * These values are estimations of how many people are born, die, or
     * immigrate for every second is the day. The assigment estimates:
     *      one person is born every 7 seconds
     *      one person dies every 13 seconds
     *      one person immigrates every 45 seconds
     */
    private static double _rateBirth       = exercise111._daySeconds / 7;
    private static double _rateDeath       = exercise111._daySeconds / -13;
    private static double _rateImmigration = exercise111._daySeconds / 45;
    private static double _ratePopulation =
        exercise111._rateBirth
        + exercise111._rateDeath
        + exercise111._rateImmigration;
    public static void main(String[] args)
    {
        int population = exercise111._populationInitial;
        System.out.println("The initial population is: " + population);
        for (int loop = 1;
            loop <= 5;
            loop++
        ) {
            population += (int) (365 * exercise111._ratePopulation);
            System.out.println(
                "The population at year " + loop
                + " is " + population
            );
        }
    }
}
