import java.util.Scanner;

public class for_loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter Number: ");
        int a = sc.nextInt();

        for(int i=a;i<=10;i++)
        {
            System.out.println(i);
        }

    }    
}
