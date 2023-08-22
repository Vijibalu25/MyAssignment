package week1.day2;

public class Calculator {
	
		

	private int addTwoNumbers (int num1, int num2) {
		return num1+num2;
	}
	
	public float mul(float num1f, int num2)
	{
		return num1f*num2;
		
	}
	
	public void sub()
	{
		int x =10;
		int y = 5;
		int z = x-y;
		System.out.println("Subtraction of x and y value is " +z);
	}
	
	public static void main(String[] args) {
		
		Calculator mycalc = new Calculator();
		System.out.println(mycalc.addTwoNumbers(14,15));
		System.out.println(mycalc.mul(8, 8));
		mycalc.sub();
		
	}

	
	} 
	
