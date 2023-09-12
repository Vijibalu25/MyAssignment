package week4.homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestUsingTreeSet {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//Create a empty Set Using TreeSet
		Set<Integer> set = new TreeSet<Integer>();
		
		//Declare for loop iterator from 0 to data.length and add into Set
		for(int i=0; i<data.length; i++)
			
			set.add(data[i]);
			
		System.out.println(set);
		
		//converted Set into List
		List<Integer> list = new ArrayList<>(set);
		
		int listLength = list.size();
		
		// Print the second last element from List
		System.out.println("Second Largest list is :"+list.get(listLength-2));
	}

}
