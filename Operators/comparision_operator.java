import java.util.Scanner;

public class comparision_operator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num= sc.nextInt();

        System.out.println("Enter Number: ");
        int num1=sc.nextInt();

        System.out.println("num 1 is greater than num 2 :"+(num>num1));
        
        System.out.println("num 1 is greater than num 2 :"+(num<num1));

        System.out.println("Num1 is greater than equal to num2 :"+(num<=num1));
        
        System.out.println("Num1 is greater than equal to num2 :"+(num>=num1));    

        System.out.println("Num1 is not equal to num2 :"+(num!=num1));

        System.out.println("Num1 is equal to num2 :"+(num==num1));
    }    
}
