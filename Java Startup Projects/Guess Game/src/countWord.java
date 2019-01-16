import java.util.Scanner;
import java.io.File;
public class countWord {


    public static void main(String [] args) throws Exception
    {
        File file = new File("Last .txt");
        Scanner read = new Scanner(file);
        int count = 0;
        while (read.hasNextLine())
        {
            String line = read.nextLine();
            //System.out.println(line.split(" ").length);
            count += line.split(" ").length;
        }

        System.out.println(count);
    }

}
