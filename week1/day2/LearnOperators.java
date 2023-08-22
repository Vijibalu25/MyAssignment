package week1.day2;

public class LearnOperators {
	
	public static void main(String[] args) {


		int a=13;
		int b=6;
		
		//These are all an example of Arithmetic Operators"
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //quotient
		System.out.println(a%b); //remainder
		
		System.out.println("***************************");
		
		//Examples of relational operators
		System.out.println(a>b && a<b); // 13<2 - true && 13<2 false
		System.out.println(a>b || a<b); 
		
		System.out.println("***************************");
		
		//Examples of Comparison Operators
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("***************************");
		System.out.println(a); // 13
		System.out.println(a++); //a+1 = 13 
		System.out.println(a); //14
		System.out.println(b);
		System.out.println(++b);
	}

}
