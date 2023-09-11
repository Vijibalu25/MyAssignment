package week4.day1.learnlistcollectionset;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateswords {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Split the String based on white spaces and save as String Array
		String[] text1 = text.split(" ");
		
		//Create an empty Set
		Set<String> set = new LinkedHashSet<>();
		
		//Then iterate the Array
		for(int i=0; i<text1.length; i++)
			
			set.add(text1[i]);
		
	}


}
