
import java.util.Scanner;

public class add1 {
    private int a;
    private int b;
    Scanner sc = new Scanner(System.in);
    // to accept the two variables
    public int accept() 
    {
        // to accept data from keyboard....
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        return a+b;
        
    }

    
}
