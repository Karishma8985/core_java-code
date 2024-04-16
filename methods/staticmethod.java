// priogram for static method
class smethod{
    static int sum(int x, int y)
    {
        int result= x+y;
        return result;
    }
}
public class staticmethod {
    public static void main(String args[]) {
        int x = smethod.sum(4, 5);
        System.out.println(x);
    }   
}
