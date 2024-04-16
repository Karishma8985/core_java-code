import java.util.*;

public class bubble_sort {
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
        int limit = n-1;        // element from 0 to n-1
        boolean flag = false;   // if it is true, swapping done
        int temp;               // temp variable

        for(int i=0; i<limit;i++)
        {
            for(int j=0;j<limit-i;j++)
            {
                //if first element is bigger than second one, then swap
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;            // true --> swapping done
                }
            }

            if(flag == false)break;     // no swapping, so come out
            else flag = false;          // assign initial value
        }

        // display sorted array

        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
    
}
