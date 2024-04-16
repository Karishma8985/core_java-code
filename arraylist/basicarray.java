import java.util.*;

public class basicarray{
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();  // creating arraylist

     
        list.add(3);    // Adding object in arraylist
        list.add(5);
        list.add(7);
        list.add(2);

            // printing array list
        
        System.out.println(list);


        // collections.sort(list)
        Iterator<Integer> itr = list.iterator();
        System.out.println("Iterator result");
        itr.forEachRemaining(a -> { System.out.println(a);});

        // using for loop

        for(Integer fruit: list)
        System.out.println(fruit);

        ListIterator<Integer> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()){
            Integer str = list1.previous();
            System.out.println(str);
            
        }
        
    }
}