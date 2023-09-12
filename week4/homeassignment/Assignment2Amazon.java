package week4.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//search as oneplus 9 pro 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
		//.Get the price of the first product
		
		String price = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole'])[1]")).getText();
		
		System.out.println("Price of the First product is :"+price);
		
		String pricereplaced = price.replaceAll(",", "");
		int priceInt = Integer.parseInt(pricereplaced);
		
		System.out.println("Converted price is :"+priceInt);
		
		//Print the number of customer ratings for the first displayed product
		String ratings = driver.findElement(By.xpath("(//div[@class='a-row a-size-small']//span[@class='a-size-base s-underline-text'])[1]")).getText();
		
		System.out.println("No of Cutomers rated this product is :"+ratings);
		
		//Click the first text link of the first image
		
		driver.findElement(By.xpath("(//div[@class='sg-col-inner']//img[@class='s-image'])[1]")).click();
	
		
        String HomePage = driver.getWindowHandle();
		
		System.out.println(HomePage);
		
	     String HomePageTitle = driver.getTitle();
	     System.out.println("Home Page title :"+HomePageTitle);
	     
	     Set<String> windowHandles = driver.getWindowHandles();
	     
	
	     for(String each: windowHandles)
	    	 
	    	 System.out.println(each);
	     
	 
	     List<String> nextWindow = new ArrayList<>(windowHandles);
	     
	     
	     driver.switchTo().window(nextWindow.get(1));
	    
	   //Click 'Add to Cart' button
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		
		///Get the cart subtotal and verify if it is correct.
//		String cartsubtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-total-string']")).getText();
		
	//	System.out.println(cartsubtotal);
		Thread.sleep(7000);
		
		//unable to print the cart price value
		String CartPrice = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-total-string']")).getText();
		
		System.out.println("Total price of items in cart :"+CartPrice);
	}
}
