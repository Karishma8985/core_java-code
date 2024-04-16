// calling method and returning the result from the method.

public class return_statement 
{
    public static void main(String args[]) 
    {
        // call mymethod() and catch the result into res.    

        //since mymethod()is static, we can call it using classname.methodname()

        int x= return_statement.mymethod(10);

        // display the result now.....
        System.out.println("Result = "+ x);
    }

    // this method calculates square value and returns it to main().
    static int mymethod(int num)
    {
        return num*num;                 // return square value
    }
}
