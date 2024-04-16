import java.io.*;
import java.util.*;

public class input_in_sameline {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
                // ask input in same line saperated with coma......
        System.out.print("Enter name, age, salary: ");

                //accept input into a string
        String str=br.readLine();

                // use StringTokenizer to split input at comas
        StringTokenizer st = new StringTokenizer(str,",");

                // we will have 3 token....

        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

                //trim any spaces before and after the tokens

        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

                //convert s1 in to string,s2 in to int, s3 in to float.....
        String name = s1;
        int age = Integer.parseInt(s2);
        float salary = Float.parseFloat(s3);

                // display contents......
        
                System.out.println("Name: "+name);
                System.out.println("Age: "+age);
                System.out.println("salary: "+salary);

    }           
}
