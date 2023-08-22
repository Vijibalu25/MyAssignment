package week1.day2;

public class LearnContinueStatement {

	public static void main(String[] args) {
		
		for (int i=0; i<=10; i++)
		{
			if(i==4)
			{
				System.out.println("Four");
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("Out of For Loop");
	}
}
