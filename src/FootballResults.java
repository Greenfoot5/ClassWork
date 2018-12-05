public class FootballResults
{
    private static int Score(char results[])
    {
        int total = 0;
        for(char result : results)
        {
            if (result == 'W')
                total += 2;
            else if (result == 'D')
                total += 1;
        }
        return total;
    }

    public static void main(String[] args)
    {
        char gameResults[] = new char[] {'W','W','L','L','D','W','D','L','L','W','W','W'};
        System.out.println(Score(gameResults));
    }
}
