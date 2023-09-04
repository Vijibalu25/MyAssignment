package Week3.homeassignements;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("This is deposit method from Axis Bank");
	}
	
	public static void main(String[] args) {
		
		BankInfo bi = new BankInfo();
		
		bi.deposit();
		
		// why axis deposit method is not showing when I am trying to call
		
	}
}
