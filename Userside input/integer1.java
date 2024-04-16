import java.io.*;
public class integer1 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter integer number: ");

        int num=Integer.parseInt(br.readLine());

        System.out.println("Enter number is : "+num);
    }
}
