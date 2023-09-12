package week4.homeassignment;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Split the String based on white spaces and save as String Array ,Then iterate the Array
		String[] array = text.split(" ");
		
		//for(int i=0; i<array.length; i++)
	    //System.out.println(array[i]);
		
		Set<String> arraySet = new LinkedHashSet<String>();
		
		//Iterate the String array
		for(int j=0; j<array.length; j++)
		{
			//d.1) add each word into Set
			arraySet.add(array[j]);
		}
		
	  //Print the Set values which is having unique words
		System.out.println(arraySet);
	   
		//converted the set into string to print the expected output
	   String result = String.join(" ", arraySet);
	   
	   //Output= We learn java basics as part of sessions in week1
	  System.out.println("Output :"+result);
	}
	

}
