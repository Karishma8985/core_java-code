import java.util.*;

class add{
    int a,b,sum;
    int add1()
    {
        sum=a+b;
        return sum;
        
    }
}
public class add_value {
    public static void main(String args[]){
        add obj = new add();
        obj.a = 7;
        obj.b = 4;
        int c = obj.add1();
        System.out.println("Sum : "+c);
    }
}
