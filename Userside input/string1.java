import java.io.*;
public class string1 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name: ");
        String name = br.readLine();

        System.out.println(" You Entered name is : "+name);
    }    
}
