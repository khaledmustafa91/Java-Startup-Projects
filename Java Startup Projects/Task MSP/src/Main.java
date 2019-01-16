import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) throws Exception
    {
        System.out.println("Choose Which Question");
        System.out.println("Question 1");
        System.out.println("Question 2");
        System.out.println("Question 3");
        System.out.println("Question 4");
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        if(x == 1)
        {
            System.out.println("Enter your number please");
            int num = read.nextInt();
            int hour , min , sec ;
            hour = num / (60*60);
            num = num % (60*60);
            min = num / 60;
            num = num %60;
            sec = num;
            System.out.println("Your Clock is : " + hour + ":" + min + ":" + sec );
        }
        else if( x == 2)
        {
            System.out.println("Enter your 3 numbers please");
            int [] arr = new int[3];
            boolean b = true;
            for(int i = 0 ; i < 3 ;i++)
                arr[i] = read.nextInt();
            for(int i = 0 ; i < 2 ;i++)
            {
                if(arr[i] >= arr[i+1])
                {
                    b = false;
                    break;
                }
            }
            if(b)
                System.out.println("They are in increasing order");
            else
                System.out.println("They are not in increasing order");
        }
        else if(x == 3)
        {
            String [][] arr = new String[3][5];
            int count = 2 , print = 1;
            for(int i = 0 ; i < 3 ; i++)
            {
                count = 2 - i;
                if(i > 0 )
                    print = i + 2*i;
                for (int j = 0; j < 5; j++) {
                    if (count == 0 && print > 0) {
                        arr[i][j] = "*";
                        print--;
                    }
                    else
                        arr[i][j] = " ";
                    if(count > 0)
                        count--;

                }
                System.out.println();

            }

            for(int i = 0 ; i < 3 ; i++)
            {
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j]);
               }
                System.out.println();
            }
        }
        else if (x == 4)
        {
            System.out.println("Enter 2 Numbers X , Y");
            int z = read.nextInt();
            int y = read.nextInt() , res = 1;

            for(int i = 0 ; i < y ; i++)
                res *= z;
            System.out.println("The Result is : " + res );
        }

    }
}
