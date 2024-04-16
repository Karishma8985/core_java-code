// using for-each loop to display array elements.

public class for_each_loop 
{
    public static void main(String args[])
    {
        //declare an array with 5 elements
        int arr[]={ 200, 19, -60, 44, 67};

        //use for each to retrive elements from array

        for(int i:arr)
        {
            System.out.println(i);      // to print complete array elements
        }

        System.out.println();
        System.out.println(arr[2]);         //to print single  array elements by index.
        System.out.println();
        System.out.println(arr[4]);
        System.out.println();
        System.out.println(arr[0]);
    }
    
}
