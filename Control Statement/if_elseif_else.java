import java.util.*;
class if_elseif_else
{
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("Number is greater than 0.");
        }
        else if(num<0)
        {
            System.out.println("Number is less than 0.");
        }
        else
        {
            System.out.println("Number is equal to 0.");
        }
    }
}
    