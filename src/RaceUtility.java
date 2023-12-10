public class RaceUtility
{
    public static double milesToKm(double miles)
    {
        return(miles * 1.609344);
    }

    public static double kmToMiles(double km)
    {
        return(km / 1.609344006);
    }

    public static String makeProper(String sentence)
    {
        String properSentence = "";
        String sentenceLowerCase = sentence.toLowerCase();
        for(int i = 0; i < sentence.length(); i++)
        {
            String character = String.valueOf(sentenceLowerCase.charAt(i));
            boolean isAfterSpace = false;
            if(i == 0)
            {
                properSentence = character.toUpperCase();
            }
            else
            {
                if (String.valueOf(sentenceLowerCase.charAt(i - 1)).equals(" "))
                {
                    isAfterSpace = true;
                }
                if (!isAfterSpace)
                {
                    properSentence = properSentence + character;
                }
                if (isAfterSpace)
                {
                    properSentence = properSentence + character.toUpperCase();
                }
            }
        }
        return properSentence;
    }
}