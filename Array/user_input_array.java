import java.util.*;
import java.io.*;
public class user_input_array {
    public static void main(String args[])
    {
        System.out.print("Enter no. of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();

        // create array with size row and col

        int arr[][]= new int[row][col];
        
        // accept a value from key-board...

        System.out.println("Enter elements of Matrixs: ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements of Matrixs: ");
        for(int i=0;i<row;i++)      // interchange vaule of row and col 
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[j][i]+" ");    // change i and j respectivly
            }
            System.out.println();
            
        }
        

    }       
    
}
