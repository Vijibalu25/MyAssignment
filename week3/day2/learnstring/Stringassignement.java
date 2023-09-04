package Week3.day2.learnstring;


public class Stringassignement {

	public static void main(String[] args) {
		
		String input ="TestLeaf";
		
		char[] ch = input.toCharArray();
		System.out.println("Converted into Array :" +ch[2]);
		
		System.out.println("Printing the converted Array in Reverse");
		for(int i=ch.length-1; i>=0; i--)

		{
			System.out.print(ch[i]);
			
			
		}
		
				
	}
	
}
