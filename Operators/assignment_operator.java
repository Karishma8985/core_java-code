import java.util.*;
public class assignment_operator 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Enter another number: ");
        int num1 = sc.nextInt();

        System.out.println("NUM = num1 + num: "+(num += num1));


        System.out.println("NUM = num1 - num: "+(num -= num1));

        System.out.println("NUM = num1 * num: "+(num *= num1));

        System.out.println("NUM= num / num1: "+(num /= num1));

        System.out.println("NUM= num1 % num: "+(num %= num1));

        System.out.println("NUM= num1 is :num :: "+(num = num1));
    }    
}
