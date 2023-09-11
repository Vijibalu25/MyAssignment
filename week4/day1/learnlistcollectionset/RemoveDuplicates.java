package week4.day1.learnlistcollectionset;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String companyname = "google";
		
		System.out.println(companyname);
		
		//converted the string into array
		char[] ch = companyname.toCharArray();
		
		
		for (int i=0; i<ch.length;i++)
			
		System.out.println(ch[i]);
		
		//declare set 
		
		Set<Character> companyset = new LinkedHashSet<>();
		
		
		for (int j=0; j<ch.length; j++)
		{
			companyset.add(ch[j]);
		}
		
		System.out.println(companyset);
		
	}
	

}
