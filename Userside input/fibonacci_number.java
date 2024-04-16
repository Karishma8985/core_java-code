import java.io.*;
import java.util.*;
public class fibonacci_number
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number for finding fibonacci series: ");
        int number= Integer.parseInt(br.readLine());

                // take first two fibonacci is as 0 and 1.......
        long f1 = 0, f2 = 1;
        
        System.out.print(f1+" ");
        System.out.print(f2+" ");

                // find next fibonacci number....
        long f = f1+f2;

        System.out.print(f+" ");

                // already 3 fibonacci numbers are displayed... so count will start at 3....
        int count = 3;
        while(count < number)
        {
            f1 = f2;
            f2 = f;
            f = f1+f2;
            System.out.print(f+" ");
            count++;

        }



    }
}

