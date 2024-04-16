import java.io.*;
import java.util.*;
public class arithmetic 
{
    public static void main(String args[]) throws IOException
    {
                // to accept data from user.....    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                //take input into str from keyboard
        System.out.print("Enter two number: ");

        String str = br.readLine();

                //split the string at coma......

        StringTokenizer st =  new StringTokenizer(str,",");

                //Take the two tokens in to s1,s2.....
        String s1 = st.nextToken();
        String s2 = st.nextToken();

                // trim the spaces in s1, s2

        s1 = s1.trim();
        s2 = s2.trim();

                // convert s1 and s2 into double type and store in n1,n2

        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

                // perform arithmetic operations.....

        System.out.println("Addition of n1 & n2: "+(n1+n2));
        System.out.println("Subtraction of n1 & n2: "+(n1-n2));
        System.out.println("Multiplication of n1 & n2: "+(n1*n2));
        System.out.println("Division of n1 & n2: "+(n1/n2));
        System.out.println("Rimender of n1 & n2: "+(n1%n2));

    }    
}
