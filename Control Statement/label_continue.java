import java.util.*;
public class label_continue 
{
    public static void main(String args[])
    {
        int i=1,j;
        
        labelp1: while(i<=3)
        {
            System.out.print(i);

            labelp2: for(j=1;j<=5;j++)
            {
                System.out.println("\t"+j);
                if(j==3)        // j value change up to 3 only
                {
                    i++;
                    continue labelp1;       // go back to
                }
            }
            i++;
            System.out.println("______________________________________");
        }
    }    
}
 