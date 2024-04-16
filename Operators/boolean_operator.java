import java.util.*;
public class boolean_operator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a=sc.nextInt();

        System.out.println("Enter number: ");
        int b=sc.nextInt();

        System.out.println("A and B is: "+(a & b));
        
        System.out.println("A or B is: "+(a | b));
        
        System.out.println("A not: "+(!(a<b)));     /* can't use single... u can use this operator with comparation operators. */
        

    }    
}
