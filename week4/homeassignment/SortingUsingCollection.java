package week4.homeassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		
		//Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)
		String[] array = {"Google","Microsoft","TestLeaf","Maverick"};
		
		 
		//get the length of the array	
		int length = array.length;
		
		System.out.println("Length of the array is :"+length);
		
		List<String> list =new ArrayList<>();
		
		for(int i=0; i<length; i++ )
			
			list.add(array[i]);
		
		//sort the array
		Collections.sort(list);
		
		System.out.println("Sorted arrays are :"+list);
		
		for(int i=list.size()-1; i>=0;  i--)
		{
			System.out.println(list.get(i));
		}
		
		// Required Output: Google, Maverick, Microsoft, TestLeaf
		String result = list.toString().replaceAll("[^a-zA-Z0-9\\s]", "");
		String finalResult = result.replace(" ", ", ");
		
		System.out.println("Output :"+finalResult);
	
	}

}
