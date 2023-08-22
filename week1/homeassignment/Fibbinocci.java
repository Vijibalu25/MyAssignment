package week1.homeassignment;

public class Fibbinocci { //Created a class by name: Fibbinocci
	
	public static void main(String[] args) {
		//Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		System.out.println("Print the Fibbinocci Series:");
		
		for (int i=1; i<=11; i++) // Iterate from 1 to the 11
		{
			System.out.println(firstNum); // Print first number
		
	    sum=firstNum + secNum; //Add first and second number assign to sum
		firstNum = secNum; //Assign second number to the first number
		secNum = sum; //Assign sum to the second number
		System.out.println(sum); // Print sum
		
	}
	}
}