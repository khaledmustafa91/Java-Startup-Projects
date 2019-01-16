import java.io.File;
import java.util.Scanner;
public class Main {

    public static void main(String [] args)throws Exception
    {
        String AllChars = "";
        String [] movies = new String[1000] ; //= {"theshawshankredemption" , "starwars" , "inception" , "samurai" , "room"};

        /* Read From File */
        File file = new File("Films.txt");
        Scanner readFile = new Scanner(file);
        int pos = 0;
        while (readFile.hasNextLine())
        {
            String res = "";
            String line = readFile.nextLine();
            for(int i = 0 ; i < line.length() ; i++)
                if(line.charAt(i) != ' ')
                    res += line.charAt(i);          // Remove all Spaces in string
            movies[pos] = res;
            pos++;
        }
        /* End Read of file */

        /* Guess The Movie */
        double random = Math.random() ;
        random *= 5;
        int index = (int) random;
        int count = movies[index].length(); // Count num of char of Movie

        String MovieName = "" ;
        for (int i = 0; i < count; i++)
            MovieName += "_";            // Fall by _
        int i = 0;
        Scanner read = new Scanner(System.in);
        String CopyName = MovieName;
        MovieName ="";
        while (true)
        {
            System.out.print("You are guessing : ");
            System.out.println(CopyName);
            System.out.println("You have guessed (" + i + ") wrong letters :" );
            System.out.print("Guess a letter : ");
            char c = read.next().charAt(0);
            int indx = movies[index].indexOf(c); // get position of char in original movie
            int Ifexist = AllChars.indexOf(c);   // get position of char in All repeated chars
            if(Ifexist == -1 )
            {
                if (indx != -1)
                {
                    for (int j = 0; j < movies[index].length(); j++) {
                        char ch = movies[index].charAt(j);  // get char of movie array
                        char inputchar = CopyName.charAt(j);
                        if ( ch == c )
                            MovieName += c ;
                        else
                            MovieName += inputchar;
                    }
                    int Check = MovieName.indexOf('_');
                    if (Check == -1) {
                        System.out.println("You have Guessed '" + MovieName + "' correctly .");
                        break;
                    }
                    CopyName = MovieName;
                    MovieName = "";
                } // check char exist in original array
                else
                    i++;
            } // Check for repeats chars
            AllChars += c;
            if(i >= 10)
            {
                System.out.println("You Loss The Game");
                break;
            }
        }
    }
}
