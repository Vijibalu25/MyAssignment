package week1.homeassignment;

public class ConvertNegativetoPostive {
		
	public static void main(String[] args) {
				
		int num = -25; //  Initialize an integer with a negative number
		if(num<=0) // Check if the number is a negative number 
		{
		System.out.println("It is a negative number :" +num);
	}
		else
		{
			System.out.println("It is a postive number :" +num);
		}
		
		int ans = num*-1; //convert the number to a positive number
		//num = Math.abs(num); ////convert the number to a positive number
		
		System.out.println("After Conversion value of num :" +ans);
		
	}
	

}
