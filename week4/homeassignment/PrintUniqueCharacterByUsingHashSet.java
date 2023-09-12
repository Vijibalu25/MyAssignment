package week4.homeassignment;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacterByUsingHashSet {
	
	public static void main(String[] args) {
		
		String input = "babu";
		
		//Convert String to Character array
		char[] array = input.toCharArray();
		
		//Create a new Set -> HashSet
		Set<Character> set = new HashSet<>();
		
		//Add each character to the Set and if it is already there, remove it
		for(int i=0; i<array.length; i++)
		{
			//
			if(set.contains(array[i]))
			{
				set.remove(array[i]);
			}
			else{
				set.add(array[i]);
			}
		}
			
			
		//Finally, print the set
		System.out.println(set);
		//Converted the Character Set into string
		
		String result = set.toString().replaceAll("[^a-zA-Z0-9\\s]", " ");
		System.out.println("Output ="+result);
	}

}
