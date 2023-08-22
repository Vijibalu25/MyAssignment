package week1.homeassignment;

public class IsPrime { //Create a class by name: IsPrime
	
	public static void main(String[] args) { //Create a main method using shortcut
		int n =11; //input
		int value = 0;
	if(n<=1)
	{
		System.out.println("The number is not prime");
	}
	for (int i = 2; i<=n/2; i++) {
		if(n%i==0)
		{
			value++;
			}
	}
	if(value >1)
	{
		System.out.println("The number is not a Prime number");
	}
		else
		{
			System.out.println("The number is a Prime Number");
		}
		
}
}
