public class continue_while_loop 
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
            }
            i++;
            System.out.println("______________________________________");
        }
    }    
}
