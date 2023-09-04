package Week3.day2.learnpolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserImplementation implements Browser{
	
	public RemoteWebDriver driver;

	@Override
	public void startApp() {
		driver = new ChromeDriver();
		
	}

	@Override
	public void startApp(String browser) {
		// TODO Auto-generated method stub
		switch(browser)
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:
			break;
			
		}
		
		
		
	}
	

}
