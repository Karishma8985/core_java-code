import java.util.*;
class arraylist_forward_reverse{
    public static void main(String args[])
    {
        ArrayList obj = new ArrayList();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);

        System.out.println("The contains of array");
        Iterator itr = obj.iterator();
        ListIterator ltr = obj.listIterator();

        while(itr.hasNext())
        {
            Object item = itr.next();
            System.out.println("The item is " + item);
        }
        
        while(ltr.hasNext())
        {
            Object item = ltr.next();
        }
        
        System.out.println("reverse order item is ");
        while(ltr.hasPrevious())
            {
                Object item1 = ltr.previous();
                System.out.println("The item is " + item1);
            }
    }
    
}