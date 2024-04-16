import java.util.*;

public class if_else_ladder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number x: ");
        int x= sc.nextInt();

        if(x > 0)
        {
            if(x % 2 ==0)
            {
                System.out.println(x+ " Given No. is EVEN.");
            }
            else
            {
                System.out.println(x+ " Given No. is ODD.");
            }
        }
        
    } 
}

