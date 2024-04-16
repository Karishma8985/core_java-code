import java.util.*;
public class bitwise_operator 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Enter number: ");
        int num1 = sc.nextInt();

        System.out.println("~num: "+(~num));
        System.out.println("num & num1 : " +(num & num1));
        System.out.println("num | num1 : " +(num | num1));
        System.out.println("num ^ num1 : "+(num ^ num1));
        System.out.println("num << : "+(num<<1));
        System.out.println("num >> 2: "+(num >> 2));
        System.out.println("num >>>2 : "+(num>>>2));
                
    }    
}
