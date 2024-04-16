import java.util.*;
public class if_else
{
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);     /*Always use when u want input from user side. */

        System.out.println("Enter Number: ");
        int num1 = sc.nextInt();

        if(num1>=18)
        {
            System.out.println("U r eligible for votting.");
        }
        else
        {
            System.out.println("u r not eligible for votting.");
        }

    }
    
}
