package edgeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class TestEdgeBrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Gopi krishnan\\eclipse-workspace\\SeleniumTest\\drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		WebDriver driver1= new EdgeDriver();
		WebDriver driver2= new EdgeDriver();
		WebDriver driver3= new EdgeDriver();
		WebDriver driver4= new EdgeDriver();
		driver.get("https://www.hollandandbarrett.com");
		driver1.get("http://www.bing.com");
		driver2.get("https://demo.opencart.com/");
		driver3.get("https://www.freecrm.com/");
		driver4.get("http://www.half.ebay.com");
	    driver.manage().window().maximize();
}
	
}