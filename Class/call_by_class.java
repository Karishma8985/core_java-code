import java.util.*;
class one{
    int a;
    int b;

    one(int x,int y)
    {
        a=x;
        b=y;
    }
    int sum()
        {
            return a+b;
        }
    }   
class two{
    int a;
    two(int x)
    {
        a=x;
    }
    void printsum()
    {
        System.out.println(a);
    }
} 
public class call_by_class {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter values: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            one o = new one(a, b);
            int ans = o.sum();

            two t = new two(ans);
            t.printsum();
    }

    
}
