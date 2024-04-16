import java.io.*;
public class character1
{
    public static void main(String args[]) throws IOException
    {
        // Create buffered reader objects to accept data from keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // ask for char and read it

        System.out.println("Enter a character: ");

        char ch=(char)br.read();

        // display character

        System.out.println("You entered : "+ch);
    }
}