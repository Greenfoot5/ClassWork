import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WinningNumbers {
    public static void main(String[] args) throws IOException
    {
        Boolean lotteryNumbers[] = new Boolean[6];    //Boolean array
        int numberOfSelectedBalls = 0;
        int winningBall;

        do {
            winningBall = (int) ((Math.random() * 50) + 1);
            if (!lotteryNumbers[winningBall]) {
                lotteryNumbers[winningBall] = true;
                numberOfSelectedBalls++;
            }
        } while (numberOfSelectedBalls != 6);

        FileWriter fw = new FileWriter("U:\\Com Sci\\Database\\MyFile.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 0; i <= 50; i++) {
            if (lotteryNumbers[i])
                bw.write(i + "\t");
            bw.write('\n');
            bw.close();
        }
    }
}
