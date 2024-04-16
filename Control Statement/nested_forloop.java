public class nested_forloop 
{
    public static void main(String[] args) 
    {
        System.out.println("i "+"\t j "+"\t k ");
        for(int i=0; i<3; i++)    
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.println(i+"\t"+j+"\t"+k);
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        
    }
        
}

