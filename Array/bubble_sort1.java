import java.util.*;
public class bubble_sort1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");

        //create an integer type array.....

        int n = sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter numbers:");
        //accept array element...
        for(int i=0; i<n; i++)
        {
            
            arr[i]= sc.nextInt();
        }
        
        // use bubble sort method 
        int temp;               // temp variable

        for(int i=0; i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                //if first element is bigger than second one, then swap
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
           
        }

        // display sorted array

        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
    
}

