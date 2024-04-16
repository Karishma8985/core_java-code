import java.util.Scanner;

public class unary_operator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value: ");
        int num = sc.nextInt();

        System.out.println("Increment of number is : "+(num++));

        System.out.println("Increment of number is : "+(++num));

        System.out.println("decrement of number is : "+(num--));

        System.out.println("decrement of number is : "+(--num));

        System.out.println("minus of number is : "+(-num));
    }    
}
