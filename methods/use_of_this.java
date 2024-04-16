class sample{
    // x is a instance variable
    private int x;

      // parameterized constructor
    sample(int x)
    {
        
        this.access();
    }
    // define method

    void access(){
        System.out.println("x: "+x);
    }
}
// main class
public class use_of_this {
    public static void main(String args[]) {
        sample s= new sample(45);

        
    }
    
}
