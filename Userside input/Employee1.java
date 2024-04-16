import java.io.*;
public class Employee1 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Employee ID: ");

        int id =Integer.parseInt(br.readLine());

        System.out.println("Enter Gender(M/F): ");
        char gender= (char)br.read();
        br.skip(2);                     // for avoiding skiping name string.

        System.out.println("Enter name: ");
        String name = br.readLine();

        System.out.println("Employee ID: "+id);
        System.out.println("Employee gender : "+gender);
        System.out.println("Employee name: "+name);
    }
}
