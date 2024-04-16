import java.util.*;
public class string_operators 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name= sc.next();

        System.out.println("Enter Name: ");
        String name1= sc.next();

        String fullname= name + name1;

        System.out.println(fullname);

    }
}
