import java.io.*;
public class float1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter float number: ");
        
        float f=Float.parseFloat(br.readLine());

        System.out.println("Entered number is : "+f);
    }
}