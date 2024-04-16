import java.util.Scanner;

public class linear_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        //for user side input

        // ask number for string

        System.out.print("Enter number of input strings: ");

        int n = sc.nextInt();

        // create string type array with size n

        String arr[] = new String[n];

        // store string into arr[]
        System.out.println("Enter a strings: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }

        //accept the string to search

        System.out.println("Enter a strings to search: ");
        String search =sc.next();

        // take boolean var..... for true or false
        boolean found = false;
        
        // search for the string in arr[]

        for(int i=0;i<n;i++)
        {
            if(search.equalsIgnoreCase(arr[i]))
            {
                System.out.println("Found at position: "+(i+1));
                found=true;
            }
        }
        //if not found, display message
        if(!found)
        System.out.println("not found in a group.....");

    }
}
