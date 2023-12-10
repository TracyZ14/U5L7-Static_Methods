public class Runner
{
    public static void main(String[] args)
    {
        System.out.println(RaceUtility.milesToKm(13.85));
        System.out.println(RaceUtility.kmToMiles(40));

        System.out.println(RaceUtility.milesToKm(26.42));
        System.out.println(RaceUtility.kmToMiles(3.5));

        System.out.println(RaceUtility.milesToKm(5));
        System.out.println(RaceUtility.kmToMiles(20.50));

        System.out.println(RaceUtility.milesToKm(0));
        System.out.println(RaceUtility.kmToMiles(0));

        System.out.println(RaceUtility.makeProper("welcome to the marathon!"));

        System.out.println(RaceUtility.makeProper("It's TIME for THE 5k!"));

        System.out.println(RaceUtility.makeProper("runners, take your marks..."));

        System.out.println(RaceUtility.makeProper("2 MILES TO GO!"));

        System.out.println(RaceUtility.makeProper("water break in 0.5 miles"));
    }
}