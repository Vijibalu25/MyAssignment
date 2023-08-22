package week1.homeassignment;

public class TwoWheeler {
	
	//declare below variables with appropriate values
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 123456789l;
	boolean isPunctured = true;
	String bikeName = "SuzukiActiva";
	double runningKM = 235.789;
	
	public static void main(String[] args) {
		 
		TwoWheeler demo = new TwoWheeler(); //create object for TwoWheeler and call all the variables inside main method and print the values.
	
		System.out.println(demo.noOfWheels);
		System.out.println(demo.noOfMirrors);
		System.out.println(demo.chassisNumber);
		System.out.println(demo.isPunctured);
		System.out.println(demo.isPunctured);
		System.out.println(demo.bikeName);
		System.out.println(demo.runningKM);
	}
}
