import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string...");

        String s = br.readLine();

        // store string in temp....

        String temp = s;

        StringBuffer sb = new StringBuffer(s);

        sb.reverse();
        // convert string buffer into string....
        s=sb.toString();

        if(temp.equalsIgnoreCase(s))
        System.out.println(temp+ " is palingdrome....");
        else
        System.out.println(temp+ " is not palingdrome....");
    }
}
