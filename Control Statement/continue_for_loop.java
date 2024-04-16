import java.util.*;
public class continue_for_loop 
{
    public static void main(String args[]) 
    {
        int i;
        for(i=0;i<10;i++)
        {
            if(i%3==0
            ) continue;       // loop will not terminate but gives further values.
            System.out.print(i+ " ");

        }
    }    
}
