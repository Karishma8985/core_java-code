
public class total_marks {
    public static void main(String args[]) 
    {
        //declare three vars
        int dept,student,marks,total=0;

        //take the marks from 3d array.
        int arr[][][]={{{50,51,52},{60,61,62}},
                       {{70,71,72},{80,81,82}},
                       {{65,66,67},{75,76,77}}};
        
        // display the marks from 3d array...

        for(dept=0;dept<3;dept++)
        {
            System.out.println("Department "+(dept+1)+": ");
            for(student=0;student<2;student++)
            {
                System.out.println("Student "+(student+1)+": ");
                for(marks=0;marks<3;marks++)
                {
                    System.out.println(arr[dept][student][marks]+" ");
                    total+=arr[dept][student][marks];
                }
                System.out.println("Total: "+total);
            }
            System.out.println();
        }

    }
}
