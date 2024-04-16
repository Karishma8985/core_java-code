import java.util.*;
public class using_scanner
{
    public static void main(String args[])
    {
        System.out.println("Enter ID, NAME, SALARY: ");
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        float salary = sc.nextFloat();

        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("SALARY: "+salary);

    }
}
