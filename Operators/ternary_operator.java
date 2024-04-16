import java.util.*;
public class ternary_operator 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        System.out.println("Enter number");
        int num1 = sc.nextInt();

        int max_value = (num >num1)? num : num1;

        System.out.println("max_value is :"+max_value);
        

    }
}
