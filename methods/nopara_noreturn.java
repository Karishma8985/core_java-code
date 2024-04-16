// program for method without parameters and return type....

class sample{
    // instance variable
    int num1,num2;

    // parameterized constructor
    sample(int x, int y)
    {
        num1=x;
        num2=y;
    }
    // method to calculate value .... this method does not accept any values and does not return result

    void sum()
    {
        int result = num1+num2;
        System.out.println("Sum: "+result);
    }
}
public class nopara_noreturn {
    public static void main(String args[]) {
        // create object for class and pass values to constructor.....

        sample s =new sample(34, 45);
        // call method
        s.sum();
        
    }    
}

