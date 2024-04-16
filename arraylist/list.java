import java.io.*;
import java.util.*;

public class list {
    public static void main(String args[]) {

        //create object of linked list

        Scanner sc = new Scanner(System.in);
        LinkedList<String> l1 = new LinkedList<String>();

        String aa;
        
        for(int i=0;i<5;i++)
        {
            aa=sc.nextLine();
            l1.add(aa);
        }
          System.out.print("list is: "+l1);     // call object which we declare in linked list
    }
    
}
