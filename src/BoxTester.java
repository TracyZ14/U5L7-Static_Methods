public class BoxTester
{
    public static void main(String[] args)
    {
        Box box = new Box(15, 12, 17);

        double len = 6.5;
        double feetInches = box.feetToInches(len);
        double meterInches = box.metersToInches(len);
        double volume = box.volume();

        System.out.println(feetInches);
        System.out.println(meterInches);
        System.out.println(volume);
    }
}