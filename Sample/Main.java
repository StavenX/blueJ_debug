
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    String source = "https://www.youtube.com/watch?v=w_iy0jmMmkA";
    
    public Main()
    {
        int score1 = 2;
        int score2 = 3;
        int score3 = 5;
        double average = calculateAverage(score1, score2, score3);
        System.out.println(average);
    }

    public double calculateAverage(int val1, int val2, int val3)
    {
        int sum = (val1 + val2 + val3);
        double average = sum / 3.0;
        return average;
    }
}
