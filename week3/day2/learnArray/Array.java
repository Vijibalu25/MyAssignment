package Week3.day2.learnArray;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		int[] scores = {98,97,76,87,90};
		
		int len =scores.length;
		Arrays.sort(scores);
		
		System.out.println("Printing the array values :");
		
		for(int i=len-1; i>=0; i--)
		{
			System.out.println(scores[i]);
		}
		
		
		
	}

}
