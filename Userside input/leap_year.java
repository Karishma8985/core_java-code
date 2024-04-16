import java.io.*;
import java.util.*;
public class leap_year
{
    public static void main(String args[]) throws IOException
    {
        // accept year

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter year: ");

        int year = Integer.parseInt(br.readLine());

        //  if it is century year and divisible by 400

        
        if(year%100==0 && year %400==0)
        {
            System.out.println("It's a Leap year.....");
        }
            // if its not a century year and divisible by 4
        else if(year%100!=0 && year%4==0)
        {
            System.out.println("It's a Leap year.....");
        }
        else
        {
            System.out.println("It's not a Leap year.....");
        }

    }    
}
