public class matrix {
public static void main(String args[])
{
    //take 2D array
    float x[][] = {{1.1f,1.2f,1.3f,1.4f},
                   {2.1f,2.2f,2.3f,2.4f},
                   {3.1f,3.2f,3.3f,3.4f}};
                // read array elements
                System.out.println("In matrix form: ");
                for(int i=0;i<3;i++)//rows
                {
                    for(int j=0;j<4;j++)    // coloumn in each rows
                    {
                        System.out.print("x["+i+"]["+j+"]"+":"+x[i][j]+"\t");
                    }
                    System.out.println();      // next line
                }
                
}
}

