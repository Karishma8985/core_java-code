// to accept name age and display if he is young, middleage, old.....
import java.io.*;
import java.util.Scanner;
class Person3{
    // instance variables
    String name;
    int age;
    
    Scanner sc =new Scanner(System.in);
    // to accept name and age....
    public void accept()
    {
        System.out.print("Enter name: ");    
        name = sc.next();

        System.out.println("Enter age: ");
        age = sc.nextInt();
    }

    // to check the age and display ....
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

public class useof_method {
    public static void main(String args[]) {
        // create person class
        Person3 obj = new Person3();
        obj.accept();
        obj.check();        
    }
}
