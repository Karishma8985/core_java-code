import java.io.*;
import java.util.*;;
class arithmatic_operator
{
    public static void main(String args[])
    {
        int x,y;          // declare variable
        x=10;           // store value in variable 
        y=19;

        int z=x+y;              //sum and store value.

        System.out.println("Sum of two number: "+z);

        System.out.println("Subtarction of two numbers: "+(x-y));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1=sc.nextInt();

        System.out.println("Enter another Number: ");
        int num2=sc.nextInt();

        System.out.println("Multiplication is: "+(num1*num2));

        System.out.println("Division is: "+(num1/num2));

        System.out.println("modulo is: "+(num1%num2));

        

        
    }
    
}