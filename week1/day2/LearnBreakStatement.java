package week1.day2;

public class LearnBreakStatement {

	public static void main(String[] args) {
		//if i find i==5-> Five ; stop the iteration
		for (int i=1; i<=10; i++)
		{
			if (i==5)
			{
				System.out.println("Five");
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Out of For Loop");
}
}