package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBroswer {

	public static void main(String[] args) throws InterruptedException {
		
			
		ChromeDriver driver = new ChromeDriver(); ////Launch the driver
		driver.get(" https://www.facebook.com/login"); //Load the URL
		driver.manage().window().maximize(); ////maximize window
		String title = driver.getTitle(); //Get the title
		System.out.println(title); //Get the title
		Thread.sleep(2000); //wait time
		driver.close(); //close the browser

	}

}
