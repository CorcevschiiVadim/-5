import java.util.Scanner;
public class Number17 {
    public static void main(String[] args) {
        int roll1, roll2;
        int numW = 0;
        int numL = 0;
        int sum = 0;
        int thePoint = 0;
        double probability;

        for (int timesPlayed = 0; timesPlayed <= 36000000; timesPlayed++)
        {
            roll1 = (int)(Math.random()*5) + 1;
            roll2 = (int)(Math.random()*5) + 1;
            sum = roll1 + roll2;

            switch(sum)
            {
                case 2:
                case 12:
                    numL = numL + 1;
                    break;
                case 13:
                    numL = numL + 1;
                    break;
                case 7:
                case 11:
                    numW = numW + 1;
                    break;
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                    thePoint = sum;
                    break;
                default:
            }

            if (thePoint != 0) {
                do {
                    roll1 = (int)(Math.random()*5) + 1;
                    roll2 = (int)(Math.random()*5) + 1;
                    sum = roll1 + roll2;
                } while (sum!=thePoint & sum!=7);

                if (sum == thePoint)
                {
                    numW = numW + 1;
                } else {
                    numL = numL + 1;
                }
            }
            thePoint = 0;
        }
        probability = (double)numW/(numW + numL);

        System.out.println("Number of Wins: " + numW);
        System.out.println("Number of Losses: " + numL);
        System.out.println("The probability of winning is: " + probability + " percent");
    }
}
