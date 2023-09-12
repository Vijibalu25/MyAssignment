package week4.homeassignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingNumberUsingSet {
	
	public static void main(String[] args) {
		
		int[] num = {8,7,9,6,1,4,2,3,10};
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println(set.add(num[i]));
		}
		//System.out.println(set);
		
		List<Integer> missnum = new ArrayList<>(set);
		
		System.out.println(missnum);
	}

}
