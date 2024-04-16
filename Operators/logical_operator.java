import java.util.Scanner;

public class logical_operator
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Enter number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number: ");
        int num2 = sc.nextInt();

        System.out.println("Num is big. "+(num>num1 && num>num2));
        
        System.out.println("Num is big. "+(num>num1 || num>num2));

        System.out.println("Num is big. "+!(num==num1));
    }    
}
