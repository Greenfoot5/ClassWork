import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GlossSearch
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        Scanner keyIn = new Scanner(System.in);
        Scanner termIn = new Scanner(System.in);
        Boolean quit = false;
        while (!quit)
        {
            int choice = 0;
            Boolean caught = true;
            while(caught) {
                try {
                    System.out.println("Please select an option:\n[1] Term Search\n[2] Keyword Search\n[3] Quit");
                    choice = in.nextInt();
                    caught = false;
                } catch (java.util.InputMismatchException e) {
                    choice = 7;
                }
            }
            switch (choice)
            {
                case 1:
                    System.out.println("What would you like to search for?");
                    String term = termIn.nextLine();
                    findTerm(term);
                    break;
                case 2:
                    System.out.println("What would you like to search for?");
                    String keyword = keyIn.nextLine();
                    findKeyword(keyword);
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Please select an integer 1, 2 or 3.");
                    break;
            }
        }
        System.out.println("Thanks for using this glossary search.");
    }

    private static void findTerm(String term) throws IOException
    {
        FileReader fr = new FileReader("U:\\Com Sci\\Database\\gloss.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        Boolean found = false;

        System.out.print(br.read());
        do
            {
            if(line.equalsIgnoreCase(term))
            {
                found = true;
                System.out.println("Your term has been located:");
                line = br.readLine();
                System.out.println(line);
            }
        } while ((line = br.readLine()) != null);

        if (!found)
            System.out.println("Your term was not found.");

        br.close();
    }

    private static void findKeyword(String keyword) throws IOException
    {
        FileReader fr = new FileReader("U:\\Com Sci\\Database\\gloss.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        Boolean found = false;

        do
        {
            String lineB = br.readLine();
            if(lineB.toLowerCase().contains(keyword.toLowerCase()))
            {
                found = true;
                System.out.println("Your keyword has been located:");
                System.out.println(line);
                System.out.println(lineB);
            }
        } while ((line = br.readLine()) != null);

        if (!found)
            System.out.println("Your keyword was not found.");

        br.close();
    }
}
