import java.io.*;
import java.util.Scanner;
public class fullname {
    public static void main(String args[]) throws IOException
    {
            // create empty string buffer object....

            StringBuffer sb = new StringBuffer();

            // To accept data from user....

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter name , middle name, last name:  ");
            
            String name = br.readLine();
            String mid = br.readLine();
            String last = br.readLine();

            // append name to sb 

            sb.append(name);
            sb.append(mid);
            sb.append(last);
            
        System.out.println(sb);
        System.out.println("Reverse :"+sb.reverse());
    }

}
