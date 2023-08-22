package week1.day2;

public class LearnMethods {
	

		
		public int getamount()
		{
			return 5;
		}
		
		public String carmodel(String brandName, int brandNum)
		{
			return brandName +" " +brandNum;
			
		}
	
		public float addTwoNumber(int num1, int num2)
		{
			return num1+num2;
			
		}
		
		public void getOTP()
		{
			System.out.println("OTP should be shared");
		}
		
		public static void main(String[] args) {
			
			LearnMethods demo = new LearnMethods();
			System.out.println(demo.getamount());
			System.out.println(demo.carmodel("Brand Name is : " +"Honda", 2));
			demo.getOTP();
			System.out.println(demo.addTwoNumber(5, 8));
			
			
		}
}
