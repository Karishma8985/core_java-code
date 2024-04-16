public class infinity_for_loop 
{
    public static void main(String args[])
    {
        int x=0;

        for( ; ; )          /*here we use break to terminate loop... else loop will go in infinite loop */
        {
            System.out.println(x);
            x++;
            if(x > 10) break;
        }
        
    }
}
