// Java Program to Sort an ArrayList

// import java.util package
import java.util.*;

class sortnumber {

	// Main driver method
	public static void main(String[] args)
	{
		// Define an objects of ArrayList class
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Adding elements to the ArrayList
		list.add(45);
		list.add(78);
		list.add(23);
		list.add(19);
		list.add(9);
		list.add(72);

		// Printing the unsorted ArrayList
		System.out.println("Before Sorting : " + list);

		// Sorting ArrayList in ascending Order
		Collections.sort(list);

		// printing the sorted ArrayList
		System.out.println("After Sorting : " + list);
	}
}

