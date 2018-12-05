import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("U:\\Com Sci\\Database\\Test.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("U:\\Com Sci\\Database\\Test.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        String line = br.readLine();

        do {
            System.out.println(line);
        } while ((line = br.readLine()) != null);

        //String addedLine = "This one too!";
        //bw.write(addedLine);
        //bw.newLine();
        //addedLine = "This challenge? Done.";
        //bw.write(addedLine);
        //bw.close();

        line = br.readLine();

        do {
            System.out.println(line);
        } while ((line = br.readLine()) != null);

        br.close();
    }
}
