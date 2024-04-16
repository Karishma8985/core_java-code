//using constructor and command line argument

import java.io.*;
import java.util.Scanner;
class persona{
    //instance variables

    String name;
    int age;

    //parameterized constructor
    persona(String s, int a)
    {
        name = s;
        age = a;
    }
    // method
    void check()
    {
        if(age<=30)
        {
            System.out.println(name+ " is Young....");
        }
        else if(age<=50)
        {
            System.out.println(name+ " is middle aged....");
        }
        else{
            System.out.println(name+ " is old aged....");
        }
    }
}

public class command_line {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // accept person anme and age from command line and stored in args[0] and args[1] as strings
        String s = sc.next();
        int a = sc.nextInt();

        persona p = new persona(s, a);
        p.check();
        
    }
}
