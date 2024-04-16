// Color name depending by value.

import java.util.*;
public class switch_statement 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
       // char color;        
        System.out.println("Enetr option:\n r for red,\n\n g for green,\n\n b for blue,\n\n w for white,\n\n n for no color");
       String ch=sc.next();

        switch(ch)
        {
            case "r":
                System.out.println("RED");
                break;
            case "g":
                System.out.println("GREEN");
                break;
            case "b":
                System.out.println("BLUE");
                break;
            case "w":
                System.out.println("WHITE");
                break;
            case "n":
                System.out.println("NO COLOR");  
                break; 
            
        }



    }    
}
