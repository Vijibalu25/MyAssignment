package week4.day1.learnlistcollectionset;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindList {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		//type mobile in the search
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);
		
       //print all the mobile prices
		List<WebElement> mobilePrices = driver.findElements(By.className("a-price-whole"));
      
       //declare a list
       List<Integer> list = new ArrayList<>();
       
       //to print
       for (WebElement each :mobilePrices) {
    	   String text = each.getText();
    	   String replacedStr = text.replaceAll(",", "");
    	   int mp = Integer.parseInt(replacedStr);
    	   list.add(mp);
    	   
       }
       
       //sort the list
       Collections.sort(list);
       
       System.out.println(list.get(0));
        
        
		
		
	}
}
