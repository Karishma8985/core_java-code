import java.util.*;
import java.io.*;
public class student_result {
    public static void main(String args[])
    {
        System.out.print("Enter no. of subject: ");   
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //create 1D array with size n
        int marks[] = new int[n];

        //store elements into array
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter marks: ");
            marks[i]=sc.nextInt();
        }

        //find total marks....
        int total=0;
        for(int i=0;i<n;i++)
        {
            total+=marks[i];
        }

        // display total....
        System.out.println("Total marks :"+total);

        //find percentage.....
        float per = (float)(total*100)/(n*100);
        System.out.println("Percentage : "+per);

    }
}
